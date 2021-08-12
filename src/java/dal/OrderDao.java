    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import model.Order;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AnhDT
 */
public class OrderDao extends DBContext{
   //NEED TO EDIT 
    public int add(Order order) {
        
        String query = "INSERT INTO order VALUES(?, ?, ?, ?, ?, ?)";
        int check = 0;

        try (
                PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            ps.setObject(1, order.getName());
            ps.setObject(2, order.getMobile());
            ps.setObject(3, order.getAddress());
            ps.setObject(4, order.getTotalPrice());
            ps.setObject(5, order.getNote());
            ps.setObject(6, order.getStatus());

            check = ps.executeUpdate();
            if (check > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                rs.next();
                return rs.getInt(1);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(new OrderDao().add(new Order(1, "coca", "0833515589", "PACIFIC ", 180000, "HELP", 1)));
    }
}
