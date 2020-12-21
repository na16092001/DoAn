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
public class Bill {
    int id;
    int id_Cus;
    LocalDate created_date;
    float total_money;
    int id_Employes;
    int id_dining;

    public Bill() {
    }

    public Bill(int id, int id_Cus, LocalDate created_date, float total_money, int id_Employes, int id_dining) {
        this.id = id;
        this.id_Cus = id_Cus;
        this.created_date = created_date;
        this.total_money = total_money;
        this.id_Employes = id_Employes;
        this.id_dining = id_dining;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Cus() {
        return id_Cus;
    }

    public void setId_Cus(int id_Cus) {
        this.id_Cus = id_Cus;
    }

    public LocalDate getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }

    public float getTotal_money() {
        return total_money;
    }

    public void setTotal_money(float total_money) {
        this.total_money = total_money;
    }

    public int getId_Employes() {
        return id_Employes;
    }

    public void setId_Employes(int id_Employes) {
        this.id_Employes = id_Employes;
    }

    public int getId_dining() {
        return id_dining;
    }

    public void setId_dining(int id_dining) {
        this.id_dining = id_dining;
    }
    
    
}
