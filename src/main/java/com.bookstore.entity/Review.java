package com.bookstore.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Review {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "review_id")
    private int reviewId;
    @Basic
    @Column(name = "book_id")
    private Integer bookId;
    @Basic
    @Column(name = "customer_id")
    private Integer customerId;
    @Basic
    @Column(name = "rating")
    private String rating;
    @Basic
    @Column(name = "headline")
    private String headline;
    @Basic
    @Column(name = "comment")
    private String comment;
    @Basic
    @Column(name = "review_time")
    private Timestamp reviewTime;
    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Book bookByBookId;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customerByCustomerId;

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Timestamp reviewTime) {
        this.reviewTime = reviewTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review = (Review) o;

        if (reviewId != review.reviewId) return false;
        if (bookId != null ? !bookId.equals(review.bookId) : review.bookId != null) return false;
        if (customerId != null ? !customerId.equals(review.customerId) : review.customerId != null) return false;
        if (rating != null ? !rating.equals(review.rating) : review.rating != null) return false;
        if (headline != null ? !headline.equals(review.headline) : review.headline != null) return false;
        if (comment != null ? !comment.equals(review.comment) : review.comment != null) return false;
        if (reviewTime != null ? !reviewTime.equals(review.reviewTime) : review.reviewTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reviewId;
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (headline != null ? headline.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (reviewTime != null ? reviewTime.hashCode() : 0);
        return result;
    }

    public Book getBookByBookId() {
        return bookByBookId;
    }

    public void setBookByBookId(Book bookByBookId) {
        this.bookByBookId = bookByBookId;
    }

    public Customer getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(Customer customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }
}
