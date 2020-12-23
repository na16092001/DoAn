/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Category;
import model.Food;

/**
 *
 * @author 84942
 */
public interface IFoodDAO extends GenericDAO<Food>{
    List<Food> getALL();
    void getById(Food food);
    void insert(Food food);
    void update(Food food);
    void delete(Food food);
}
