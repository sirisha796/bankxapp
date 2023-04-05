package com.api.bankxapp.mapper;

import com.api.bankxapp.dto.TransactionDTO;
import com.api.bankxapp.dto.TransactionDTO4BankZ;
import com.api.bankxapp.entity.Transaction;

public class TransactionMapper {
	
	public static  Transaction DTOtoEntity(TransactionDTO transactionDTO) {
		
		Transaction tran=new Transaction();
		tran.setId(transactionDTO.getId());
		tran.setAccount_transId(transactionDTO.getAccount_TransId());
		tran.setAmount(transactionDTO.getAmount());
		tran.setTransactionName(transactionDTO.getTransactionName());
		tran.setTransactionType(transactionDTO.getTransactionType());
		
		return tran;
	}
	
public static TransactionDTO EntitytoDTO(Transaction transaction) {
		
		TransactionDTO tranDTO=new TransactionDTO();
		tranDTO.setId(transaction.getId());
		tranDTO.setAccount_TransId(transaction.getAccount_transId());
		tranDTO.setAmount(transaction.getAmount());
		tranDTO.setTransactionName(transaction.getTransactionName());
		tranDTO.setTransactionType(transaction.getTransactionType());
		
		return tranDTO;
	}
	
public static TransactionDTO DTO4BankZ(TransactionDTO4BankZ transactionDTO4BankZ) {
	TransactionDTO transactionDTO=new TransactionDTO();
	transactionDTO.setTransactionName(transactionDTO4BankZ.getTransactionName());
	transactionDTO.setAmount(transactionDTO4BankZ.getAmount());
	transactionDTO.setOrginalCustomerId(transactionDTO4BankZ.getCustomerId());
	transactionDTO.setTransactionType(transactionDTO4BankZ.getTransactionType());
	
	return transactionDTO;
	
}
	

}