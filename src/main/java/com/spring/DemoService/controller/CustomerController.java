package com.spring.DemoService.controller;

import com.spring.DemoService.model.Customer;
import com.spring.DemoService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {


    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping()
    public ResponseEntity<Customer> getCustomer() {
        return ResponseEntity.ok().body(customerService.getCustomer());
    }

    @GetMapping("/in-mem")
    public ResponseEntity<Customer> getCustomerInMem() {
        Customer customer=new Customer();
        customer.setLastName("manoj");
        customer.setFirstName("Pradeep");
        return ResponseEntity.ok().body(customer);
    }
    @PostMapping()
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customerReq) {
        ;
        return ResponseEntity.ok().body(customerService.createCustomer(customerReq));
    }

}
