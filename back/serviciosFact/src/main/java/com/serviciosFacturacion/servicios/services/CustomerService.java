package com.serviciosFacturacion.servicios.services;

import com.serviciosFacturacion.servicios.models.CustomerModel;
import com.serviciosFacturacion.servicios.repositories.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    ICustomerRepository customerRepository;

    public ArrayList<CustomerModel> getCustomers(){

        return (ArrayList<CustomerModel>) customerRepository.findAll();
    }

    public CustomerModel saveCustomer(CustomerModel customer){

        return customerRepository.save(customer);
    }

    public Optional<CustomerModel> getById(Long id_cliente ){
        return  customerRepository.findById(id_cliente);

    }

    @Transactional
    public CustomerModel updateById(CustomerModel request, Long id_cliente) {

        CustomerModel customer = customerRepository.findById(id_cliente).orElse(null);
        if (customer != null) {

            customer.setNum_ident(request.getNum_ident());
            customer.setNomb_cli(request.getNomb_cli());
            customer.setApell_cli(request.getApell_cli());
            customer.setEmail_cli(request.getEmail_cli());
            customer.setDirec_cli(request.getDirec_cli());
            customer.setTelef_cli(request.getTelef_cli());
        }
        return customer;
    }


}
