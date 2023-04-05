package com.api.bankxapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.bankxapp.entity.Account;
import com.api.bankxapp.entity.Customer;
import com.api.bankxapp.entity.Transaction;

public interface AccountRepository extends JpaRepository<Account, Long>{

	//@Query("select a from Account a where a.Cust_Acc_Id=?1 and a.account_Type=?2")
	//Account findByJPQL(Long customerId,int accountType);
	@Query(value = "select * from Account a where a.Cust_Acc_Id=?1 and a.account_Type=?2", nativeQuery = true)
	Account findByNativeSQL(Long customerId,int accountType);
}
