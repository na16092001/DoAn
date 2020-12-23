/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Business;

/**
 *
 * @author 84942
 */
public class BussinesMapper implements RowMapper<Business>{

    @Override
    public Business mapRow(ResultSet rs) {
        try {
            Business bs=new Business();
            bs.setId(rs.getInt("id"));
            bs.setName(rs.getNString("name"));
            bs.setStatus_Busines(rs.getBoolean("status_Busines"));
            return bs;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
