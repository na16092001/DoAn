/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.util.List;;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employes;

/**
 *
 * @author 84942
 */
public class NhanVienDAO {
    private static Connection conn=utils.DatabaseConnect.getConnection();
    List<Employes> lstEmployes=new ArrayList<>();
    public List<Employes> getAll(){
        lstEmployes.removeAll(lstEmployes);
        try {
            String sql="";
        } catch (Exception e) {
        }
        return lstEmployes;
    }
    
    public List<Employes> create(){
        try {
            lstEmployes.remove(lstEmployes);
            String sql ="{CALL proc_insertEmployes}";
            CallableStatement call = conn.prepareCall(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstEmployes;
    }
}
