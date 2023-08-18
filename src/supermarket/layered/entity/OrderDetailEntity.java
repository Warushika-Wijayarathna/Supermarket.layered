/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.entity;

/**
 *
 * @author user
 */
public class OrderDetailEntity {
    private String orderId;
    private String itemId;
    private Integer qty;
    private Double discount;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(String orderId, String itemId, Integer qty, Double discount) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.qty = qty;
        this.discount = discount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" + "orderId=" + orderId + ", itemId=" + itemId + ", qty=" + qty + ", discount=" + discount + '}';
    }
    
    
}
