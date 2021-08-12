    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AnhDT
 */
public class CategoryDao extends DBContext {

    public List<Category> getAll() {

        String query = "SELECT * FROM category";
        List<Category> ls = new ArrayList<>();

        try (
                PreparedStatement ps = connection.prepareStatement(query)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category(rs.getInt(1), rs.getString(2), rs.getInt(3));
                ls.add(category);
            }
            return ls;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
//NEED TO EDIT
    public Category getOne(int id) {

          String query = "SELECT * FROM category WHERE id = ?";
        
        try (
                PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Category p = new Category();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setStatus(rs.getInt("status"));
                return p;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    
    }
 

    public static void main(String[] args) {
      
    }

//      public Category getOne(int id) {
//        
//        String query = "SELECT * FROM categories WHERE id = ?";
//        
//        try (Connection con = SQLServerConnection.getConnection();
//                PreparedStatement ps = con.prepareStatement(query)) {
//            ps.setInt(1, id);
//            
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                Category p = Category.builder()
//                        .id(rs.getInt(1))
//                        .name(rs.getString(2))
//                        .status(rs.getInt(3))
//                        .build();
//                return p;
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        }
//        return null;
//    }
}
