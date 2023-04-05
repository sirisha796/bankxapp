package com.api.bankxapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.bankxapp.dto.AccountDTO;
import com.api.bankxapp.dto.CustomerDTO;
import com.api.bankxapp.dto.CustomerDetailsDTO;
import com.api.bankxapp.dto.TransactionDTO;
import com.api.bankxapp.entity.Account;
import com.api.bankxapp.entity.Customer;
import com.api.bankxapp.entity.Transaction;
import com.api.bankxapp.mapper.AccountMapper;
import com.api.bankxapp.mapper.CustomerMapper;
import com.api.bankxapp.producer.RabbitMQProducer;
import com.api.bankxapp.repository.AccountRepository;
import com.api.bankxapp.repository.CustomerRepository;
import com.api.bankxapp.repository.TransactionRepository;
import com.api.bankxapp.utilities.AccountType;
import com.api.bankxapp.utilities.TransactionType;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private AccountRepository accountRepo;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private RabbitMQProducer producer;
	
	
	public void createCustomer(CustomerDetailsDTO customerDetailsDTO) {
		
		Customer customer=new Customer(
				);
		customer.setCustomerName(customerDetailsDTO.getCustomerName());
		Customer cust1=customerRepo.save(customer);
		
		Account curAccount=new Account();
		curAccount.setCust_Acc_Id(cust1.getCustomerId());
		curAccount.setAccount_Type(AccountType.Current);
		Account savedCurAcc=accountRepo.save(curAccount);
		
		Account savAccount=new Account();
		savAccount.setCust_Acc_Id(cust1.getCustomerId());
		savAccount.setAccount_Type(AccountType.SAVING);
		savAccount.setBalance(500);
		Account savedSavAcc=accountRepo.save(savAccount);
		
		Transaction tran=new Transaction();
		tran.setTransactionName("Account Creation Credit");
		tran.setAccount_transId(savedSavAcc.getAccountId());
		tran.setAmount(500);
		tran.setTransactionType(TransactionType.CREDIT);
		tran.setTransactionDate(new Date());
		tran.setBankZ(false);
		transactionRepository.save(tran);
		
		
		//Building CustomerDetailDTO
		ArrayList<AccountDTO> accList=new ArrayList<AccountDTO>();
		accList.add(AccountMapper.EntitytoDTO(savedCurAcc));
		accList.add(AccountMapper.EntitytoDTO(savedSavAcc));
		
		
		customerDetailsDTO.setId(cust1.getCustomerId());
		customerDetailsDTO.setAccounts(accList);
		customerDetailsDTO.setAmount(500L);
		
		 producer.sendMessage("Customer Registered and Saving Account Credited with Rs.500");
				
				
			
		
		
		
		
	}
	public List<CustomerDTO> getAllCustomers(){
		List<Customer> custList=customerRepo.findAll();
		
		return custList.stream().map(cust->CustomerMapper.EntitytoDTO(cust)).collect(Collectors.toList());
	}
}
