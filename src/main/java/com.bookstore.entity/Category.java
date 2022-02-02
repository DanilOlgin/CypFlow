package com.bookstore.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Category {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "category_id")
    private String categoryId;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "categoryByCategoryId")
    private Collection<Book> booksByCategoryId;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryId != null ? !categoryId.equals(category.categoryId) : category.categoryId != null) return false;
        if (name != null ? !name.equals(category.name) : category.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Collection<Book> getBooksByCategoryId() {
        return booksByCategoryId;
    }

    public void setBooksByCategoryId(Collection<Book> booksByCategoryId) {
        this.booksByCategoryId = booksByCategoryId;
    }
}
