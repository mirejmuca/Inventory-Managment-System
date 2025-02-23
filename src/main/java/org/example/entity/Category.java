package org.example.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.security.Timestamp;

@Entity
public class Category {

    public Category() {

    }

    public Category(Long id){
        this.categoryId = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    private String name;

    private String description;

    @CreationTimestamp
   @Column(name = "created_at")
    private Timestamp createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Timestamp updatedAt;


}
