/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;;
import java.sql.Connection;
import java.util.ArrayList;
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
}
