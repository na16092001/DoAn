/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Customer;

/**
 *
 * @author 84942
 */
public interface ICustomerDAO extends GenericDAO<Customer>{
    List<Customer> getALL();
    void getById(Customer customer);
    void insert(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
}
