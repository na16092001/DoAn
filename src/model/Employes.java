/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author 84942
 */
public class Employes {

    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String password;
    private boolean gender;
    private int id_Busines;
    private boolean status_Employes;
    private String bussines;

    public Employes() {
    }

    public Employes(String name, String phone, String email, String address, String password, boolean gender, boolean status_Employes, String bussines) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.password = password;
        this.gender = gender;
        this.status_Employes = status_Employes;
        this.bussines = bussines;
    }

    public Employes(String name, String phone, String email, String address, String password, boolean gender, int id_Busines, boolean status_Employes) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.password = password;
        this.gender = gender;
        this.id_Busines = id_Busines;
        this.status_Employes = status_Employes;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId_Busines() {
        return id_Busines;
    }

    public void setId_Busines(int id_Busines) {
        this.id_Busines = id_Busines;
    }

    public boolean isStatus_Employes() {
        return status_Employes;
    }

    public void setStatus_Employes(boolean status_Employes) {
        this.status_Employes = status_Employes;
    }

    public String getBussines() {
        return bussines;
    }

    public void setBussines(String bussines) {
        this.bussines = bussines;
    }

    @Override
    public String toString() {
        return this.bussines;
    }
    
    
}
