package com.api.bankxapp.dto;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


public class AccountDTO {
	
	private Long accountId;
	
	private Long Cust_AccId;
	private int accountType;
	
	
    List < TransactionDTO > transactions = new ArrayList < > ();


	public AccountDTO() {
		super();
	}


	public AccountDTO(Long accountId, Long cust_AccId, int accountType) {
		super();
		this.accountId = accountId;
		Cust_AccId = cust_AccId;
		this.accountType = accountType;
		
	}


	public Long getAccountId() {
		return accountId;
	}


	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}


	public Long getCust_AccId() {
		return Cust_AccId;
	}


	public void setCust_AccId(Long cust_AccId) {
		Cust_AccId = cust_AccId;
	}


	public int getAccountType() {
		return accountType;
	}


	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}


	public List<TransactionDTO> getAccounts() {
		return transactions;
	}


	public void setAccounts(List<TransactionDTO> transactions) {
		this.transactions = transactions;
	}

}
