package com.api.bankxapp.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.bankxapp.entity.Account;
import com.api.bankxapp.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	@Query(value = "select * from Transaction t where t.transaction_Date=?1 and t.is_BankZ=?2", nativeQuery = true)
	ArrayList<Transaction> findByNativeSQL(LocalDate transaction_date,boolean isBankZ);
}