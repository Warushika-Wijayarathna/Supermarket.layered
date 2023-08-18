/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.service.custom.Impl;

import java.util.ArrayList;
import supermarket.layered.dao.DaoFactory;
import supermarket.layered.dao.custom.ItemDao;
import supermarket.layered.dto.ItemDto;
import supermarket.layered.entity.ItemEntity;
import supermarket.layered.service.custom.ItemService;

/**
 *
 * @author user
 */
public class ItemServiceImpl implements ItemService{
    ItemDao itemDao=(ItemDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String addItem(ItemDto dto) throws Exception {
        if (itemDao.add(new ItemEntity(dto.getId(), dto.getDescription(), dto.getPackSize(), dto.getUnitPrice(),dto.getQty()))) {
            return "Success";
        }else{
            return "Fail";
        }
    }

    @Override
    public String updateItem(ItemDto dto) throws Exception {
        if (itemDao.update(new ItemEntity(dto.getId(), dto.getDescription(), dto.getPackSize(), dto.getUnitPrice(),dto.getQty()))) {
            return "Success";
        }else{
            return "Fail";
        }        
    }

    @Override
    public String deleteItem(String id) throws Exception {
        if (itemDao.delete(id)) {
            return "Success";
        } else {
            return "Fail";
        }
    }

    @Override
    public ItemDto getItem(String id) throws Exception {
        ItemEntity entity =itemDao.get(id);
        return new ItemDto(entity.getId(), 
                entity.getDescription(), 
                entity.getPackSize(), 
                entity.getUnitPrice(), 
                entity.getQty());
    }

    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {
        ArrayList<ItemDto> itemDtos=new ArrayList<>();
        
        ArrayList<ItemEntity> itemEntitys=itemDao.getAll();
        
        for (ItemEntity entity: itemEntitys) {
            ItemDto itemDto=new ItemDto(entity.getId(), 
                    entity.getDescription(), 
                    entity.getPackSize(), 
                    entity.getUnitPrice(), 
                    entity.getQty());
            itemDtos.add(itemDto);
        }
        return itemDtos;
    }
    
}
