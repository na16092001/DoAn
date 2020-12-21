/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author daika
 */
public class Food {              
    int id;
    String image_food;
    float price_entry;
    float price_selling;
    boolean status_food;
    LocalDate date_food;
    int id_Category;

    public Food() {
    }

    
    public Food(int id, String image_food, float price_entry, float price_selling, boolean status_food, LocalDate date_food, int id_Category) {
        this.id = id;
        this.image_food = image_food;
        this.price_entry = price_entry;
        this.price_selling = price_selling;
        this.status_food = status_food;
        this.date_food = date_food;
        this.id_Category = id_Category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage_food() {
        return image_food;
    }

    public void setImage_food(String image_food) {
        this.image_food = image_food;
    }

    public float getPrice_entry() {
        return price_entry;
    }

    public void setPrice_entry(float price_entry) {
        this.price_entry = price_entry;
    }

    public float getPrice_selling() {
        return price_selling;
    }

    public void setPrice_selling(float price_selling) {
        this.price_selling = price_selling;
    }

    public boolean isStatus_food() {
        return status_food;
    }

    public void setStatus_food(boolean status_food) {
        this.status_food = status_food;
    }

    public LocalDate getDate_food() {
        return date_food;
    }

    public void setDate_food(LocalDate date_food) {
        this.date_food = date_food;
    }

    public int getId_Category() {
        return id_Category;
    }

    public void setId_Category(int id_Category) {
        this.id_Category = id_Category;
    }
            
    
}