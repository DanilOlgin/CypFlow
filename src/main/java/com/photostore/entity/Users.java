package com.photostore.entity;

import javax.persistence.*;

@Entity
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "full_name")
    private String fullName;
    @Basic
    @Column(name = "user_name")
    private String userName;
    @ManyToOne
    @JoinColumn(name = "user_name", referencedColumnName = "commentator_name", insertable = false, updatable = false)
    private PhotoComments photoCommentsByUserName;
    @OneToOne(mappedBy = "usersByUserId")
    private UsersRoles usersRolesByUserId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (userId != users.userId) return false;
        if (email != null ? !email.equals(users.email) : users.email != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (fullName != null ? !fullName.equals(users.fullName) : users.fullName != null) return false;
        if (userName != null ? !userName.equals(users.userName) : users.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }

    public PhotoComments getPhotoCommentsByUserName() {
        return photoCommentsByUserName;
    }

    public void setPhotoCommentsByUserName(PhotoComments photoCommentsByUserName) {
        this.photoCommentsByUserName = photoCommentsByUserName;
    }

    public UsersRoles getUsersRolesByUserId() {
        return usersRolesByUserId;
    }

    public void setUsersRolesByUserId(UsersRoles usersRolesByUserId) {
        this.usersRolesByUserId = usersRolesByUserId;
    }
}
