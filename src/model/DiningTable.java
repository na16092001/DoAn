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
public class DiningTable {
    int id;
    String name;
    boolean status_dining;

    public DiningTable() {
    }

    public DiningTable(int id, String name, boolean status_dining) {
        this.id = id;
        this.name = name;
        this.status_dining = status_dining;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus_dining() {
        return status_dining;
    }

    public void setStatus_dining(boolean status_dining) {
        this.status_dining = status_dining;
    }
    
    
}
