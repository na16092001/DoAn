/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implemnt;

import DAO.GenericDAO;
import Mapper.RowMapper;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84942
 */
public class AbstractDAO<T> implements GenericDAO<T>{

    @Override
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameter) {
        List<T> result=new ArrayList<>();
        CallableStatement cal=null;
        ResultSet rs=null;
        Connection conn=null;
        try {
            conn=utils.DatabaseConnect.getInstance().getConnection();
            cal=conn.prepareCall(sql);
            setParameter(cal,parameter);
            rs = cal.executeQuery();
            while (rs.next()) {
                result.add(rowMapper.mapRow(rs));
            }
            return result;
        } catch (SQLException e) {
            Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                if (conn != null) {
                    conn.close();
                }
                if (cal != null) {
                    cal.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                // TODO: handle exception
            }
        }
        return null;
    }
    private void setParameter(CallableStatement cal, Object... parameters){
        try {
            for (int i = 0; i < parameters.length; i++) {
                Object parameter = parameters[i];
                int index =i+1;
                if (parameter instanceof Integer) {
                    cal.setInt(index, (int) parameter);
                }else if(parameter instanceof String){
                    cal.setNString(index, (String) parameter);
                }else if(parameter instanceof Float){
                    cal.setFloat(index, (float) parameter);
                }else if(parameter instanceof Boolean){
                    cal.setBoolean(index, (boolean) parameter);
                }else if(parameter instanceof LocalDate){
                    cal.setDate(index, (Date) parameter);
                }
            }
        } catch (SQLException e) {
        }
    }
    @Override
    public void update(String sql, Object... parameters) {
       CallableStatement cal=null;
        ResultSet rs=null;
        Connection conn=null;
        try {
            conn = utils.DatabaseConnect.getInstance().getConnection();
            conn.setAutoCommit(false);
            cal = conn.prepareCall(sql);
            setParameter(cal, parameters);
            cal.executeUpdate();
            conn.commit();
            
        } catch (Exception e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                if (conn != null) {
                    conn.close();
                }
                if (cal != null) {
                    cal.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                // TODO: handle exception
            }
           
        }
    }

    @Override
    public void insert(String sql, Object... parameters) {
       CallableStatement cal=null;
        ResultSet rs=null;
        Connection conn=null;
        try {
            conn = utils.DatabaseConnect.getInstance().getConnection();
            conn.setAutoCommit(false);
            cal = conn.prepareCall(sql);
            setParameter(cal, parameters);
            cal.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
                if (conn != null) {
                    conn.close();
                }
                if (cal != null) {
                    cal.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                // TODO: handle exception
            }
           
        }
    }

    @Override
    public void delete(String sql, Object... parameters) {
        CallableStatement cal=null;
        ResultSet rs=null;
        Connection conn=null;
        
    }
    
}
