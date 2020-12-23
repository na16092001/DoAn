/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.DiningTable;

/**
 *
 * @author 84942
 */
public interface IDinningTableDAO extends GenericDAO<DiningTable>{
    List<DiningTable> getALL();
    void insert(DiningTable diningTable);
    void update(DiningTable diningTable);
    void delete(DiningTable diningTable);
}
