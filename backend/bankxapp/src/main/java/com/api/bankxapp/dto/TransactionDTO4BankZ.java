package com.api.bankxapp.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO4BankZ {
	private long id;
	private String transactionName;
	private long amount;
	private int transactionType;
	private Date transactionDate;
	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	private long customerId;
	private String customerName;
	public TransactionDTO4BankZ(long id, String transactionName, long amount, int transactionType) {
		super();
		this.id = id;
		this.transactionName = transactionName;
		this.amount = amount;
		this.transactionType = transactionType;
	}
	
	public TransactionDTO4BankZ() {
		super();
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTransactionName() {
		return transactionName;
	}
	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public int getTransactionType() {
		return transactionType;
	}
	
	
	public void setTransactionType(int transactionType) {
		this.transactionType = transactionType;
	}
	
	
	
}
