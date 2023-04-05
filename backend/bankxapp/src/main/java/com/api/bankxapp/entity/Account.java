package com.api.bankxapp.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long accountId;
	
	private Long Cust_Acc_Id;
	private int account_Type;
	private long balance;
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_transId", referencedColumnName = "accountId")
    List < Transaction > accounts = new ArrayList < > ();
	
	public Account() {
		super();
	}

	public Account(Long accountId, Long cust_Acc_Id, int account_Type) {
		super();
		this.accountId = accountId;
		Cust_Acc_Id = cust_Acc_Id;
		this.account_Type = account_Type;
		
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	

	public Long getCust_Acc_Id() {
		return Cust_Acc_Id;
	}

	public void setCust_Acc_Id(Long cust_Acc_Id) {
		Cust_Acc_Id = cust_Acc_Id;
	}

	public int getAccount_Type() {
		return account_Type;
	}

	public void setAccount_Type(int account_Type) {
		this.account_Type = account_Type;
	}

	public List<Transaction> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Transaction> accounts) {
		this.accounts = accounts;
	}

	
	
	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	

}
