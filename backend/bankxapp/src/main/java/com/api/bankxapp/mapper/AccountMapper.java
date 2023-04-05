package com.api.bankxapp.mapper;

import com.api.bankxapp.dto.AccountDTO;
import com.api.bankxapp.dto.TransactionDTO;
import com.api.bankxapp.entity.Account;
import com.api.bankxapp.entity.Transaction;

public class AccountMapper {
	
	public static Account DTOtoEntity(AccountDTO accountDTO) {
		
		Account acc=new Account();
		acc.setAccountId(accountDTO.getAccountId());
		acc.setAccount_Type(accountDTO.getAccountType());
		acc.setCust_Acc_Id(accountDTO.getCust_AccId());
		
		
		return acc;
	}
	
public static AccountDTO EntitytoDTO(Account account) {
		
		AccountDTO accDTO=new AccountDTO();
		accDTO.setAccountId(account.getAccountId());
		accDTO.setAccountType(account.getAccount_Type());
		accDTO.setCust_AccId(account.getCust_Acc_Id());
		
		
		return accDTO;
	}
	
	

}
