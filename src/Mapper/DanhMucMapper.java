/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Category;

/**
 *
 * @author 84942
 */
public class DanhMucMapper implements RowMapper<Category>{

    @Override
    public Category mapRow(ResultSet rs) {
        try {
            Category cate=new Category();
            cate.setId(rs.getInt("id"));
            cate.setGroupFood(rs.getNString("groupFood"));
            cate.setStatus_cat(rs.getBoolean("status_cat"));
            return cate;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
