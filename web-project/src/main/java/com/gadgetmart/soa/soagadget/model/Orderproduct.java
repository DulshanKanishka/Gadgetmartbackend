package com.gadgetmart.soa.soagadget.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Orderproduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
//    private int order_id;
    private int product_id;
    private int product_quantity;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Orderdetail orderdetail;

    public Orderproduct() {
        super();
    }

    public Orderproduct(int id, int product_id, int product_quantity, Orderdetail orderdetail) {
        this.id = id;
        this.product_id = product_id;
        this.product_quantity = product_quantity;
        this.orderdetail = orderdetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public Orderdetail getOrderdetail() {
        return orderdetail;
    }

    public void setOrderdetail(Orderdetail orderdetail) {
        this.orderdetail = orderdetail;
    }

    @Override
    public String toString() {
        return "Orderproduct{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", product_quantity=" + product_quantity +
                ", orderdetail=" + orderdetail +
                '}';
    }
}
