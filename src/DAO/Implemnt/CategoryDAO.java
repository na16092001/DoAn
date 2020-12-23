/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implemnt;

import DAO.ICategoryDAO;
import Mapper.DanhMucMapper;
import java.util.List;
import model.Category;

/**
 *
 * @author daika
 */
public class CategoryDAO extends AbstractDAO<Category> implements ICategoryDAO{

    @Override
    public List<Category> getALL() {
        String sql = "{CALL proc_getAllCategory}";
        return query(sql, new DanhMucMapper());
    }

    @Override
    public void insert(Category category) {
        String sql = "{CALL proc_InsertCategory(?,?)}";
        this.insert(sql, category.getGroupFood(),category.getStatus_cat());
    }

    @Override
    public void update(Category category) {
        String sql = "{CALL proc_UpdateCategory(?,?,?)}";
        this.update(sql, category.getGroupFood(),category.getStatus_cat(),category.getId());
    }

    @Override
    public void delete(Category category) {
        String sql = "{CALL proc_DeleteCategory(?)}";
        this.update(sql, category.getId());
    }
    
}
