package com.interview.test.service;

import com.interview.test.model.Customer;

import java.util.List;

public interface CustomerService {

    public Customer saveCustomerDetailes(Customer customer);

    public Customer editCustomerDetailes(Customer customer);
    public Customer getCustomerDetailes(Long cusId);
    public List<Customer> getAllCustomerDetailes();
    public void deleteCustomerDetailes(Long cusId);
}
