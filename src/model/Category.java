/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author daika
 */
public class Category {
    int id;
    String groupFood;
    Boolean status_cat;

    public Category() {
    }

    public Category(int id, String groupFood, Boolean status_cat) {
        this.id = id;
        this.groupFood = groupFood;
        this.status_cat = status_cat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupFood() {
        return groupFood;
    }

    public void setGroupFood(String groupFood) {
        this.groupFood = groupFood;
    }

    public Boolean getStatus_cat() {
        return status_cat;
    }

    public void setStatus_cat(Boolean status_cat) {
        this.status_cat = status_cat;
    }
    
    
}
