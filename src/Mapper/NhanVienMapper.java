/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Employes;

/**
 *
 * @author 84942
 */
public class NhanVienMapper implements RowMapper<Employes> {

    @Override
    public Employes mapRow(ResultSet rs) {

        try {
            Employes em = new Employes();
            em.setId(rs.getInt("id"));
            em.setName(rs.getNString("name"));
            em.setPhone(rs.getNString("phone"));
            em.setEmail(rs.getNString("email"));
            em.setAddress(rs.getNString("address"));
            em.setPassword(rs.getNString("email"));
            em.setGender(rs.getBoolean("gender"));
            em.setId_Busines(rs.getInt("id_Busines"));
            em.setStatus_Employes(rs.getBoolean("status_Employes"));
            em.setCreated_date(rs.getDate("created_date").toLocalDate());
            return em;
        } catch (SQLException e) {
            return null;
        }
    }

}
