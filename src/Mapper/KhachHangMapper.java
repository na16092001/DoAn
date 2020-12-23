/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Customer;

/**
 *
 * @author 84942
 */
public class KhachHangMapper implements RowMapper<Customer>{

    @Override
    public Customer mapRow(ResultSet rs) {
        try {
            Customer cus=new Customer();
            cus.setId(rs.getInt("id"));
            return cus;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
