package com.api.bankxapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
	private boolean isBankZ;
	private long id;
	private String transactionName;
	private long amount;
	private int transactionType;
	private long account_TransId;
	private int transferFrom;
    private int transferTo;
    private long customerId;
    private long orginalCustomerId;
	
	public TransactionDTO(long id, String transactionName, long amount, int transactionType) {
		super();
		this.id = id;
		this.transactionName = transactionName;
		this.amount = amount;
		this.transactionType = transactionType;
	}
	public TransactionDTO() {
		super();
		
	}
	
	public boolean isBankZ() {
		return isBankZ;
	}
	public void setBankZ(boolean isBankZ) {
		this.isBankZ = isBankZ;
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
	
	public long getAccount_TransId() {
		return account_TransId;
	}
	public void setAccount_TransId(long account_TransId) {
		this.account_TransId = account_TransId;
	}
	 
		public int getTransferFrom() {
			return transferFrom;
		}
		public void setTransferFrom(int transferFrom) {
			this.transferFrom = transferFrom;
		}
		public int getTransferTo() {
			return transferTo;
		}
		public void setTransferTo(int transferTo) {
			this.transferTo = transferTo;
		}
		public long getCustomerId() {
			return customerId;
		}
		public void setCustomerId(long customerId) {
			this.customerId = customerId;
		}
		public long getOrginalCustomerId() {
			return orginalCustomerId;
		}
		public void setOrginalCustomerId(long orginalCustomerId) {
			this.orginalCustomerId = orginalCustomerId;
		}
}
