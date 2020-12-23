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
import utils.DatabaseConnect;

/**
 *
 * @author 84942
 */
public class AbstractDAO<T> implements GenericDAO<T> {

    @Override
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameter) {
        List<T> result = new ArrayList<>();
        CallableStatement csmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DatabaseConnect.getInstance().getConnection();
            csmt = conn.prepareCall(sql);
            setParameter(csmt, parameter);
            rs = csmt.executeQuery();
            while (rs.next()) {
                result.add(rowMapper.mapRow(rs));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (csmt != null) {
                    csmt.close();
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

    private void setParameter(CallableStatement csmt, Object... parameters) {
        try {
            for (int i = 0; i < parameters.length; i++) {
                Object parameter = parameters[i];
                int index = i + 1;
                if (parameter instanceof Integer) {
                    csmt.setInt(index, (int) parameter);
                } else if (parameter instanceof String) {
                    csmt.setNString(index, (String) parameter);
                } else if (parameter instanceof Float) {
                    csmt.setFloat(index, (float) parameter);
                } else if (parameter instanceof Boolean) {
                    csmt.setBoolean(index, (boolean) parameter);
                } else if (parameter instanceof LocalDate) {
                    csmt.setDate(index, (Date) parameter);
                }
            }
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(String sql, Object... parameters) {
        CallableStatement csmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = DatabaseConnect.getInstance().getConnection();
            conn.setAutoCommit(false);
            csmt = conn.prepareCall(sql);
            setParameter(csmt, parameters);
            csmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                if (conn != null) {
                    conn.close();
                }
                if (csmt != null) {
                    csmt.close();
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
        CallableStatement csmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = DatabaseConnect.getInstance().getConnection();
            conn.setAutoCommit(false);
            csmt = conn.prepareCall(sql);
            setParameter(csmt, parameters);
            csmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                if (conn != null) {
                    conn.close();
                }
                if (csmt != null) {
                    csmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                // TODO: handle exception
            }
        }
    }
}


