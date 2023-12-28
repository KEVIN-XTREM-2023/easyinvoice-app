package com.serviciosFacturacion.servicios.controllers;

import com.serviciosFacturacion.servicios.models.CustomerModel;
import com.serviciosFacturacion.servicios.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ArrayList<CustomerModel> getCustomers(){

        return this.customerService.getCustomers();
    }

    @PostMapping
    public CustomerModel saveCustomer(@RequestBody CustomerModel customer){
        return this.customerService.saveCustomer(customer);
    }


    @GetMapping(path = "/{id}")
    public Optional<CustomerModel> getCustomerById(@PathVariable("id") Long id_cliente) {
        return this.customerService.getById(id_cliente);
    }

    @PutMapping(path = "/{id}")
    public CustomerModel updateCustomerById(@RequestBody CustomerModel request, @PathVariable("id") Long id_cliente){
        return this.customerService.updateById(request, id_cliente);

    }
    /**
    @GetMapping("/{numIdent}")
    public CustomerModel getCustomerByNumIdent(@PathVariable("numIdent") String numIdent) {
        return customerService.findCustomerByNumIdent(numIdent)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }*/


}
