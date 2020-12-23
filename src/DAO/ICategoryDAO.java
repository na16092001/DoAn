/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Business;
import model.Category;

/**
 *
 * @author 84942
 */
public interface ICategoryDAO extends GenericDAO<Category>{
    List<Category> getALL();
    void insert(Category category);
    void update(Category category);
    void delete(Category category);
}
