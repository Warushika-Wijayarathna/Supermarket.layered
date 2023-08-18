/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.dto;

/**
 *
 * @author user
 */
public class OrderDetailDto {
    private String itemCode;
    private Integer orderQty;
    private Double discount;

    public OrderDetailDto(String itemCode, Integer orderQty, Double discount) {
        this.itemCode = itemCode;
        this.orderQty = orderQty;
        this.discount = discount;
    }

    public OrderDetailDto() {
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Integer getOrderQty() {
        return orderQty;
    }

    public void setQty(Integer orderQty) {
        this.orderQty = orderQty;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" + "itemCode=" + itemCode + ", orderQty=" + orderQty + ", discount=" + discount + '}';
    }
    
}
