/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.dao;

import supermarket.layered.dao.custom.Impl.CustomerDaoImpl;
import supermarket.layered.dao.custom.Impl.ItemDaoImpl;
import supermarket.layered.dao.custom.Impl.OrderDaoImpl;
import supermarket.layered.dao.custom.Impl.OrderDetailDaoImpl;

/**
 *
 * @author user
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){
        
    }
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ITEM:
                return new ItemDaoImpl();
            case ORDER:
                return new OrderDaoImpl();
            case ORDERDETAIL:
                return new OrderDetailDaoImpl();                
            default:
                return null;
        }
    }
    
    public enum DaoTypes{
        CUSTOMER,ITEM,ORDER,ORDERDETAIL
    }
}
