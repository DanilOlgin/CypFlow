package com.bookstore.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "book_id")
    private int bookId;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "author")
    private String author;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "ISBN")
    private String isbn;
    @Basic
    @Column(name = "image")
    private byte[] image;
    @Basic
    @Column(name = "price")
    private double price;
    @Basic
    @Column(name = "date_published")
    private Date datePublished;
    @Basic
    @Column(name = "updated_on")
    private Timestamp updatedOn;
    @Basic
    @Column(name = "category_id")
    private String categoryId;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category categoryByCategoryId;
    @OneToMany(mappedBy = "bookByBookId")
    private Collection<OrderDetail> orderDetailsByBookId;
    @OneToMany(mappedBy = "bookByBookId")
    private Collection<Review> reviewsByBookId;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (bookId != book.bookId) return false;
        if (Double.compare(book.price, price) != 0) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (description != null ? !description.equals(book.description) : book.description != null) return false;
        if (isbn != null ? !isbn.equals(book.isbn) : book.isbn != null) return false;
        if (!Arrays.equals(image, book.image)) return false;
        if (datePublished != null ? !datePublished.equals(book.datePublished) : book.datePublished != null)
            return false;
        if (updatedOn != null ? !updatedOn.equals(book.updatedOn) : book.updatedOn != null) return false;
        if (categoryId != null ? !categoryId.equals(book.categoryId) : book.categoryId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = bookId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (datePublished != null ? datePublished.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        return result;
    }

    public Category getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(Category categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }

    public Collection<OrderDetail> getOrderDetailsByBookId() {
        return orderDetailsByBookId;
    }

    public void setOrderDetailsByBookId(Collection<OrderDetail> orderDetailsByBookId) {
        this.orderDetailsByBookId = orderDetailsByBookId;
    }

    public Collection<Review> getReviewsByBookId() {
        return reviewsByBookId;
    }

    public void setReviewsByBookId(Collection<Review> reviewsByBookId) {
        this.reviewsByBookId = reviewsByBookId;
    }
}
