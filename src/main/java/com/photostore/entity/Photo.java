package com.photostore.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Photo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "photo_id")
    private int photoId;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "image")
    private byte[] image;
    @Basic
    @Column(name = "category_name")
    private String categoryName;
    @OneToMany(mappedBy = "photoByPhotoId")
    private Collection<OrderDetails> orderDetailsByPhotoId;
    @OneToMany(mappedBy = "photoByName")
    private Collection<Category> photoByName;
    @OneToOne(mappedBy = "photoByPhotoId")
    private PhotoComments photoCommentsByPhotoId;
    @OneToOne(mappedBy = "photoByPhotoId")
    private PhotoTags photoTagsByPhotoId;

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo = (Photo) o;

        if (photoId != photo.photoId) return false;
        if (title != null ? !title.equals(photo.title) : photo.title != null) return false;
        if (description != null ? !description.equals(photo.description) : photo.description != null) return false;
        if (!Arrays.equals(image, photo.image)) return false;
        if (categoryName != null ? !categoryName.equals(photo.categoryName) : photo.categoryName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = photoId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        return result;
    }

    public Collection<OrderDetails> getOrderDetailsByPhotoId() {
        return orderDetailsByPhotoId;
    }

    public void setOrderDetailsByPhotoId(Collection<OrderDetails> orderDetailsByPhotoId) {
        this.orderDetailsByPhotoId = orderDetailsByPhotoId;
    }

    public Collection<Category> getPhotoByName() {
        return photoByName;
    }

    public void setPhotoByName(Collection<Category> photoByName) {
        this.photoByName = photoByName;
    }

    public PhotoComments getPhotoCommentsByPhotoId() {
        return photoCommentsByPhotoId;
    }

    public void setPhotoCommentsByPhotoId(PhotoComments photoCommentsByPhotoId) {
        this.photoCommentsByPhotoId = photoCommentsByPhotoId;
    }

    public PhotoTags getPhotoTagsByPhotoId() {
        return photoTagsByPhotoId;
    }

    public void setPhotoTagsByPhotoId(PhotoTags photoTagsByPhotoId) {
        this.photoTagsByPhotoId = photoTagsByPhotoId;
    }
}
