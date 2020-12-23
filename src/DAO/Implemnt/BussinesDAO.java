/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implemnt;
import DAO.IBusiness;
import Mapper.NhanVienMapper;
import java.util.List;
import model.Business;
import Mapper.BussinesMapper;
/**
 *
 * @author 84942
 *//**
 *
 * @author 84942
 */
public class BussinesDAO extends AbstractDAO<Business> implements IBusiness{

    @Override
    public List<Business> getAll() {
        String sql = "select *from tbl_Business";
        return query(sql, new BussinesMapper());
    }

    @Override
    public void getById(Business business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Business business) {
        String sql = "{CALL proc_insertBusiness(?,?)}";
        this.insert(sql, business.getName(), business.isStatus_Busines());
    }

    @Override
    public void update(Business business) {
        String sql = "{CALL proc_UpdateBusiness(?,?,?)}";
                this.update(sql, business.getName(),business.isStatus_Busines(),business.getId());
    }

    @Override
    public void delete(Business business) {
        String sql = "{CALL proc_DeleteBusiness(?)}";
        this.update(business);
    }
    
}
