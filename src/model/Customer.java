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
public class Customer {
    int id;
    String name;
    String phone;
    String address;
    boolean status_customer;

    public Customer() {
    }

    public Customer(int id, String name, String phone, String address, boolean status_customer) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.status_customer = status_customer;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus_customer() {
        return status_customer;
    }

    public void setStatus_customer(boolean status_customer) {
        this.status_customer = status_customer;
    }
    
    
}
