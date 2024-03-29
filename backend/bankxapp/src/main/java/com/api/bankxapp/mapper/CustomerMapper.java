package com.api.bankxapp.mapper;

import com.api.bankxapp.dto.AccountDTO;
import com.api.bankxapp.dto.CustomerDTO;
import com.api.bankxapp.dto.TransactionDTO;
import com.api.bankxapp.entity.Account;
import com.api.bankxapp.entity.Customer;
import com.api.bankxapp.entity.Transaction;

public class CustomerMapper {
	
	public static Customer DTOtoEntity(CustomerDTO custDTO) {
		
		Customer cust=new Customer();
		cust.setCustomerId(custDTO.getCustomerId());
		cust.setCustomerName(custDTO.getCustomerName());
		return cust;
	}
	
public static CustomerDTO EntitytoDTO(Customer cust) {
		
		CustomerDTO custDTO=new CustomerDTO();
		custDTO.setCustomerId(cust.getCustomerId());
		System.out.println("custID::"+cust.getCustomerId());
		custDTO.setCustomerName(cust.getCustomerName());
		return custDTO;
	}
	
	

}
