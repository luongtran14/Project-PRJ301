/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import model.Cart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


/**
 *
 * @author AnhDT
 */
public class OrderDetailDao extends DBContext{
    
    public boolean add(List<Cart> listCart, int orderId) {
        
        String query = "INSERT INTO orderdetail VALUES(?, ?, ?, ?, ?)";

        try (
                PreparedStatement ps = connection.prepareStatement(query)) {
            for (Cart c : listCart) {
                ps.setObject(1, orderId);
                ps.setObject(2, c.getId());
                ps.setObject(3, c.getName());
                ps.setObject(4, c.getPrice());
                ps.setObject(5, c.getQuantity());
                ps.addBatch();
            }      
            ps.executeBatch();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return false;
    }
}
