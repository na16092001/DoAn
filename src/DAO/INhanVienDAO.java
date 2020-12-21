/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Employes;

/**
 *
 * @author 84942
 */
public interface INhanVienDAO extends GenericDAO<Employes>{
    List<Employes> getAll();
    void getById(Employes employes);
    void insert(Employes employes);
    void update(Employes employes);
    void delete(Employes employes);
}
