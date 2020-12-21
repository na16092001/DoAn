/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Mapper.RowMapper;

/**
 *
 * @author 84942
 * @param <T>
 */
public interface GenericDAO<T> {
    <T> List <T> query(String sql, RowMapper<T> rowMapper, Object... parameter);
       void update(String sql, Object... parameters);
       void insert(String sql, Object... parameters);
}
