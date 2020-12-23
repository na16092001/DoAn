/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Business;

/**
 *
 * @author 84942
 */
public interface IBusiness extends GenericDAO<Business>{
    List<Business> getAll();
    void getById(Business business);
    void insert(Business business);
    void update(Business business);
    void delete(Business business);
}
