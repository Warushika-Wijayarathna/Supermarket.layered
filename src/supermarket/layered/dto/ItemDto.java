/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.dto;

/**
 *
 * @author user
 */
public class ItemDto {
    private String id;
    private String description;
    private String packSize;
    private Double unitPrice;
    private Integer qty;

    public ItemDto() {
    }

    public ItemDto(String id, String description, String packSize, Double unitPrice, Integer qty) {
        this.id = id;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "id=" + id + ", description=" + description + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", qty=" + qty + '}';
    }

    
}
