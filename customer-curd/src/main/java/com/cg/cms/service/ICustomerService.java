package com.cg.cms.service;

import org.springframework.stereotype.Service;

import com.cg.cms.entities.Customer;
import java.util.*;

@Service
public interface ICustomerService {

	void addCustomer(Customer customer);

	List<Customer> fetchAll();

	void delCustomer(int id);

	void updateCustomer(Customer customer);

	Customer fetchById(int id);
}