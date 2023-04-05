package com.api.bankxapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.bankxapp.entity.Customer;
import com.api.bankxapp.entity.Transaction;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
