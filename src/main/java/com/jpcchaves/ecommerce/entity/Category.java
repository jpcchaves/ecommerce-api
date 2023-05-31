package com.jpcchaves.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;

    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "category_sub_categories",
            joinColumns = @JoinColumn(
                    name = "category_id", referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "sub_category_id", referencedColumnName = "id"
            )
    )
    private Set<SubCategory> subCategories = new HashSet<>();

    public Category() {
    }

    public Category(Long id,
                    String name,
                    Date createdAt,
                    Date updatedAt,
                    Set<SubCategory> subCategories) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.subCategories = subCategories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("subCategories")
    public Set<SubCategory> getSubCategory() {
        return subCategories;
    }

    public void setSubCategory(Set<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }
}
