package com.photostore.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "photo_comments", schema = "photostore", catalog = "")
public class PhotoComments implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "photo_id")
    private int photoId;
    @Basic
    @Column(name = "comment_id")
    private int commentId;
    @Basic
    @Column(name = "rating")
    private String rating;
    @Basic
    @Column(name = "comment")
    private String comment;
    @Basic
    @Column(name = "time_commented")
    private Timestamp timeCommented;
    @Basic
    @Column(name = "commentator_name")
    private String commentatorName;
    @OneToOne
    @JoinColumn(name = "photo_id", referencedColumnName = "photo_id", nullable = false)
    private Photo photoByPhotoId;

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getTimeCommented() {
        return timeCommented;
    }

    public void setTimeCommented(Timestamp timeCommented) {
        this.timeCommented = timeCommented;
    }

    public String getCommentatorName() {
        return commentatorName;
    }

    public void setCommentatorName(String commentatorName) {
        this.commentatorName = commentatorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoComments that = (PhotoComments) o;

        if (photoId != that.photoId) return false;
        if (commentId != that.commentId) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (timeCommented != null ? !timeCommented.equals(that.timeCommented) : that.timeCommented != null)
            return false;
        if (commentatorName != null ? !commentatorName.equals(that.commentatorName) : that.commentatorName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = photoId;
        result = 31 * result + commentId;
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (timeCommented != null ? timeCommented.hashCode() : 0);
        result = 31 * result + (commentatorName != null ? commentatorName.hashCode() : 0);
        return result;
    }

    public Photo getPhotoByPhotoId() {
        return photoByPhotoId;
    }

    public void setPhotoByPhotoId(Photo photoByPhotoId) {
        this.photoByPhotoId = photoByPhotoId;
    }
}
