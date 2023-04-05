package com.api.bankxapp.dto;

import java.util.ArrayList;
import java.util.List;

public class CustomerDetailsDTO {
	
	private Long id;
	private List < AccountDTO > accounts = new ArrayList < > ();
	
	private String customerName;
	
	private Long Amount;
	
	public CustomerDetailsDTO(String customerName, Long amount) {
		super();
		this.customerName = customerName;
		Amount = amount;
	}
	
	public List<AccountDTO> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountDTO> accounts) {
		this.accounts = accounts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public CustomerDetailsDTO() {
		super();
	}

	public Long getAmount() {
		return Amount;
	}

	public void setAmount(Long amount) {
		Amount = amount;
	}

	

}
