/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.service.custom;

import java.util.List;
import supermarket.layered.dto.ItemDto;
import supermarket.layered.service.SuperService;

/**
 *
 * @author user
 */
public interface ItemService extends SuperService{
    String addItem(ItemDto itemDto) throws Exception;
    String updateItem(ItemDto itemdto) throws Exception;
    String deleteItem(String id) throws Exception;
    ItemDto getItem(String id) throws Exception;
    List<ItemDto> getAllItem() throws Exception;
}
