/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket.layered.service.custom;

import supermarket.layered.dto.OrderDto;
import supermarket.layered.service.SuperService;

/**
 *
 * @author user
 */
public interface OrderService extends SuperService{
    String placeOrder(OrderDto dto)throws Exception;
}
