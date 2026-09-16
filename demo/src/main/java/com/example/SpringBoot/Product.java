package com.example.SpringBoot;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
    String Name;
    String category;

    public Product(){

    }

    public Product(Integer id, String Name, String category){
        this.id=id;
        this.Name=Name;
        this.category=category;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(Name, product.Name) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, category);
    }
}
