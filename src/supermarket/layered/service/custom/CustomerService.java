/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket.layered.service.custom;

import java.util.ArrayList;
import supermarket.layered.dto.CustomerDto;
import supermarket.layered.service.SuperService;

/**
 *
 * @author user
 */
public interface CustomerService extends SuperService {

    String addCustomer(CustomerDto customerDto) throws Exception;
    
    String updateCustomer(CustomerDto customerDto) throws Exception;
    
    String deleteCustomer(String id) throws Exception;
    
    ArrayList<CustomerDto> getAllCustomer() throws Exception;

    CustomerDto getCustomer(String id)throws Exception;
    
}
