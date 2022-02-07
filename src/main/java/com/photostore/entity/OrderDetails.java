package com.photostore.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_details", schema = "photostore", catalog = "")
public class OrderDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id")
    private int orderId;
    @Basic
    @Column(name = "photo_id", insertable = false, updatable = false)
    private int photoId;
    @Basic
    @Column(name = "photo_size")
    private String photoSize;
    @Basic
    @Column(name = "price")
    private double price;
    @Basic
    @Column(name = "amount")
    private int amount;
    @Basic
    @Column(name = "total")
    private double total;
    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", nullable = false)
    private OrderPhoto orderPhotoByOrderId;
    @ManyToOne
    @JoinColumn(name = "photo_id", referencedColumnName = "photo_id", nullable = false)
    private Photo photoByPhotoId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getPhotoSize() {
        return photoSize;
    }

    public void setPhotoSize(String photoSize) {
        this.photoSize = photoSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderDetails that = (OrderDetails) o;

        if (orderId != that.orderId) return false;
        if (photoId != that.photoId) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (amount != that.amount) return false;
        if (Double.compare(that.total, total) != 0) return false;
        if (photoSize != null ? !photoSize.equals(that.photoSize) : that.photoSize != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderId;
        result = 31 * result + photoId;
        result = 31 * result + (photoSize != null ? photoSize.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + amount;
        temp = Double.doubleToLongBits(total);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public OrderPhoto getOrderPhotoByOrderId() {
        return orderPhotoByOrderId;
    }

    public void setOrderPhotoByOrderId(OrderPhoto orderPhotoByOrderId) {
        this.orderPhotoByOrderId = orderPhotoByOrderId;
    }

    public Photo getPhotoByPhotoId() {
        return photoByPhotoId;
    }

    public void setPhotoByPhotoId(Photo photoByPhotoId) {
        this.photoByPhotoId = photoByPhotoId;
    }
}
