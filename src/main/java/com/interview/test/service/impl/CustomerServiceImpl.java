package com.interview.test.service.impl;

import com.interview.test.model.Customer;
import com.interview.test.repository.CustomerRepository;
import com.interview.test.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomerDetailes(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer editCustomerDetailes(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerDetailes(Long cusId) {
        return customerRepository.findById(cusId).get();
    }

    @Override
    public List<Customer> getAllCustomerDetailes() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomerDetailes(Long cusId) {

        customerRepository.deleteById(cusId);

    }
}
