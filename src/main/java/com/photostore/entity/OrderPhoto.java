package com.photostore.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_photo", schema = "photostore", catalog = "")
public class OrderPhoto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id")
    private int orderId;
    @Basic
    @Column(name = "customer_id")
    private int customerId;
    @OneToOne(mappedBy = "orderPhotoByOrderId")
    private OrderDetails orderDetailsByOrderId;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false, insertable = false, updatable = false)
    private CustomerDetails customerDetailsByCustomerId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPhoto that = (OrderPhoto) o;

        if (orderId != that.orderId) return false;
        if (customerId != that.customerId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + customerId;
        return result;
    }

    public OrderDetails getOrderDetailsByOrderId() {
        return orderDetailsByOrderId;
    }

    public void setOrderDetailsByOrderId(OrderDetails orderDetailsByOrderId) {
        this.orderDetailsByOrderId = orderDetailsByOrderId;
    }

    public CustomerDetails getCustomerDetailsByCustomerId() {
        return customerDetailsByCustomerId;
    }

    public void setCustomerDetailsByCustomerId(CustomerDetails customerDetailsByCustomerId) {
        this.customerDetailsByCustomerId = customerDetailsByCustomerId;
    }
}
