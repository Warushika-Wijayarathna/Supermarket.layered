/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.controller;


import java.net.IDN;
import java.util.ArrayList;
import supermarket.layered.dto.CustomerDto;
import supermarket.layered.service.ServiceFactory;
import supermarket.layered.service.custom.CustomerService;


/**
 *
 * @author user
 */
public class CustomerController {
    
    private CustomerService customerService=(CustomerService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public String saveCustomer(CustomerDto customerDto) throws Exception{
        return customerService.addCustomer(customerDto);
    }

    public ArrayList<CustomerDto> getAllCustomers() throws Exception{
        return customerService.getAllCustomer();
    }

    public CustomerDto searchCustomer(String id) throws Exception{
        return customerService.getCustomer(id);
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(String id) throws Exception{
        return customerService.deleteCustomer(id);
    }




}
