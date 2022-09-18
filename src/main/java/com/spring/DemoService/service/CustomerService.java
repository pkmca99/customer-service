package com.spring.DemoService.service;

import com.spring.DemoService.Entity.CustomerEntity;
import com.spring.DemoService.model.Customer;
import com.spring.DemoService.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository)
    {
        this.customerRepository=customerRepository;
    }
    public Customer getCustomer()
    {
       CustomerEntity customerEntity1 =customerRepository.getById(1);
        Customer customer=new Customer();
        customer.setFirstName(customerEntity1.getFirstName());
        customer.setLastName(customerEntity1.getLastName());
        return customer;
    }
    public Customer createCustomer(Customer customerReq)
    {
        CustomerEntity customerEntity=new CustomerEntity();
        customerEntity.setFirstName(customerReq.getFirstName());
        customerEntity.setLastName(customerReq.getLastName());

        customerEntity= customerRepository.save(customerEntity);
        Customer customerRes=new Customer();
        customerRes.setFirstName(customerEntity.getFirstName());
        customerRes.setLastName(customerEntity.getLastName());
        customerRes.setId(customerEntity.getId());
        return customerRes;
    }
}
