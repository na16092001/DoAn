/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 84942
 */
public class Business {
    private int id;
    private String name;
    private boolean status_Busines;

    public Business() {
    }
    public Business(int id, String name, boolean status_Busines) {
        this.id = id;
        this.name = name;
        this.status_Busines = status_Busines;
    }

    public Business(String name, boolean status_Busines) {
        this.name = name;
        this.status_Busines = status_Busines;
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

    public boolean isStatus_Busines() {
        return status_Busines;
    }

    public void setStatus_Busines(boolean status_Busines) {
        this.status_Busines = status_Busines;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
