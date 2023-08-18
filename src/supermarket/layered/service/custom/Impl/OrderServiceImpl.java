/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.service.custom.Impl;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import supermarket.layered.dao.DaoFactory;
import supermarket.layered.dao.custom.ItemDao;
import supermarket.layered.dao.custom.OrderDao;
import supermarket.layered.dao.custom.OrderDetailDao;
import supermarket.layered.dto.OrderDetailDto;
import supermarket.layered.dto.OrderDto;
import supermarket.layered.entity.ItemEntity;
import supermarket.layered.entity.OrderDetailEntity;
import supermarket.layered.entity.OrderEntity;
import supermarket.layered.service.custom.OrderService;
import supermarket.mvc.db.DBConnection;

/**
 *
 * @author user
 */
public class OrderServiceImpl implements OrderService{
    
    private OrderDao orderDao= (OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER);
    private OrderDetailDao orderDetailDao=(OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDERDETAIL);
    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String placeOrder(OrderDto dto) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();

        
        try {
            connection.setAutoCommit(false);
            
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
            if(orderDao.add(new OrderEntity(dto.getOrderId(), sdf.format(new Date()), dto.getCustomerId()))){
                boolean isOrderSaved=true;
                for (OrderDetailDto orderDetailDto : dto.getOrderDetailDtos()) {
                    if(!orderDetailDao.add(new OrderDetailEntity(dto.getOrderId(), 
                            orderDetailDto.getItemCode(),
                            orderDetailDto.getOrderQty(), 
                            orderDetailDto.getDiscount()))){
                        isOrderSaved=false;
                    }
                }
                if (isOrderSaved) {
                    boolean isItemUpdated=true;
                    
                    for(OrderDetailDto orderDetailDto:dto.getOrderDetailDtos()){
                        ItemEntity entity =itemDao.get(orderDetailDto.getItemCode());
                        entity.setQty(entity.getQty()-orderDetailDto.getOrderQty());
                        if (!itemDao.update(entity)) {
                            isItemUpdated=false;
                        }
                    }
                    
                    if (isItemUpdated) {
                        connection.commit();
                        return "Success";
                    }else{
                        connection.rollback();
                        return"Item Update Error";
                    }
                } else {
                    connection.rollback();
                    return"Order DetailSave Error";
                }
                
            }else{
                connection.rollback();
                return"Order Save Error";
            }
            
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
        
    }
    
}
