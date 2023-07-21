package com.interview.test.controller;

import com.interview.test.model.Customer;
import com.interview.test.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/customer")
public class CustomerControllerManyToOne {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/saveCustomer")
    public Customer saveCustomerDetailes(@RequestBody Customer customer) {
        return customerService.saveCustomerDetailes(customer);
    }

    @PutMapping("/editCustomer")
    public Customer editCustomerDetailes(@RequestBody Customer customer) {
        return customerService.editCustomerDetailes(customer);
    }


    @GetMapping("/getCustomer/{cusId}")
    public Customer getCustomerDetailes(@PathVariable Long cusId) {
        return customerService.getCustomerDetailes(cusId);
    }

    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomerDetailes() {
        return customerService.getAllCustomerDetailes();
    }

    @DeleteMapping("/deleteCustomerById/{cusId}")
    public void deleteCustomerDetailes(@PathVariable Long cusId) {

        customerService.deleteCustomerDetailes(cusId);

    }
    
}
