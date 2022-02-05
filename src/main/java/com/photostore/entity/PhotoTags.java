package com.photostore.entity;

import javax.persistence.*;

@Entity
@Table(name = "photo_tags", schema = "photostore", catalog = "")
public class PhotoTags {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "photo_id")
    private int photoId;
    @Basic
    @Column(name = "tag")
    private String tag;
    @OneToOne
    @JoinColumn(name = "photo_id", referencedColumnName = "photo_id", nullable = false)
    private Photo photoByPhotoId;

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoTags photoTags = (PhotoTags) o;

        if (photoId != photoTags.photoId) return false;
        if (tag != null ? !tag.equals(photoTags.tag) : photoTags.tag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = photoId;
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        return result;
    }

    public Photo getPhotoByPhotoId() {
        return photoByPhotoId;
    }

    public void setPhotoByPhotoId(Photo photoByPhotoId) {
        this.photoByPhotoId = photoByPhotoId;
    }
}
