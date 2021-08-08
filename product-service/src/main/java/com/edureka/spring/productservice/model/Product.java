package com.edureka.spring.productservice.model;

//Representation of databse row - Entity

import javax.persistence.*;

@Table(name="product")
@Entity
public class Product {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="code")
    private String name;

    @Column(name="description")
    private String description;

    //many more ...


    public Product() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
