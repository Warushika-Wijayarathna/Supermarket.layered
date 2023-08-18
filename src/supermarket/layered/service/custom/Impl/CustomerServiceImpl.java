/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.service.custom.Impl;

import java.util.ArrayList;
import supermarket.layered.dao.DaoFactory;
import supermarket.layered.dao.custom.CustomerDao;
import supermarket.layered.dto.CustomerDto;
import supermarket.layered.entity.CustomerEntity;
import supermarket.layered.service.custom.CustomerService;


/**
 *
 * @author user
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity entity = new CustomerEntity(dto.getId(),
                dto.getTitle(), dto.getName(), dto.getDob(),
                dto.getSalary(), dto.getAddress(), dto.getCity(),
                dto.getProvince(), dto.getZip());
        
        
        
        return customerDao.add(entity) ? "Success" : "Fail";
    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity entity = new CustomerEntity(dto.getId(),
                dto.getTitle(), dto.getName(), dto.getDob(),
                dto.getSalary(), dto.getAddress(), dto.getCity(),
                dto.getProvince(), dto.getZip());
        
        
        
        return customerDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        return customerDao.delete(id) ? "Success" : "Fail";
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        
        CustomerDto dto = new CustomerDto(entity.getId(), 
                    entity.getTitle(), entity.getName(),
                    entity.getDob(),
                    entity.getSalary(), entity.getAddress(), 
                    entity.getCity(), entity.getProvince(), entity.getZip());
        
        return dto;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        
        for (CustomerEntity entity : customerEntitys) {
            customerDtos.add(new CustomerDto(entity.getId(), 
                    entity.getTitle(), entity.getName(),
                    entity.getDob(),
                    entity.getSalary(), entity.getAddress(), 
                    entity.getCity(), entity.getProvince(), entity.getZip()));
        }
         
        return customerDtos;
    }    
    
}