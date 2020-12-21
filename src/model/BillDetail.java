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
public class BillDetail {
    int id_bill;
    int id_food;
    int quantity;
    LocalDate created_date;

    public BillDetail() {
    }

    public BillDetail(int id_bill, int id_food, int quantity, LocalDate created_date) {
        this.id_bill = id_bill;
        this.id_food = id_food;
        this.quantity = quantity;
        this.created_date = created_date;
    }

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }

    public int getId_food() {
        return id_food;
    }

    public void setId_food(int id_food) {
        this.id_food = id_food;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }
    
    
}
