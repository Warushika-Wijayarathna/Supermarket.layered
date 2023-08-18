/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.entity;

/**
 *
 * @author user
 */
public class OrderEntity {
   private String id;
   private String date;
   private String custId;

    public OrderEntity() {
    }

    public OrderEntity(String id, String date, String custId) {
        this.id = id;
        this.date = date;
        this.custId = custId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "OrderEntity{" + "id=" + id + ", date=" + date + ", custId=" + custId + '}';
    }
   
}
