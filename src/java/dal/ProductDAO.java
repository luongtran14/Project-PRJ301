/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import dal.DBContext;
import model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;

/**
 *
 * @author xuanh
 */
public class ProductDAO extends DBContext {

    public int addProduct(Product c) {
        int n = 0;
        try {

            String sql = "insert into Product(id,name,price,quantity,imageName,description,categoryID) "
                    + "values(?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, c.getId());
            stm.setString(2, c.getName());
            stm.setInt(3, c.getQuantity());
            stm.setDouble(4, c.getPrice());
            stm.setString(5, c.getImgName());
            stm.setString(6, c.getDescription());

            stm.setInt(7, c.getCategory().getId());
            n = stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int UpdateProduct(Product c) {
        int n = 0;
        try {

            String sql = "Update Product set name=?,price=?,quantity=?,imageName=?,description=?,status=?, categoryID=? where id=?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, c.getName());
            stm.setInt(3, c.getQuantity());
            stm.setDouble(2, c.getPrice());
            stm.setString(4, c.getImgName());
            stm.setString(5, c.getDescription());
            stm.setInt(6, c.getStatus());
            stm.setInt(7, c.getCategory().getId());
            stm.setInt(8, c.getId());
            n = stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int DeleteProductbyPid(int id) {
        int n = 0;
        try {

            String sql = "delete from Product where id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            n = stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int DeleteProductbyName(String name) {
        int n = 0;
        try {

            String sql = "delete from Product where name like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, name);
            n = stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

//    public void findProductByName(String name) {
//
//        try {
//            String sql = "Select * from Product where name = ?";
//            PreparedStatement stm = connection.prepareStatement(sql,
//                    ResultSet.TYPE_SCROLL_SENSITIVE,
//                    ResultSet.CONCUR_UPDATABLE);
//            stm.setString(1, name);
//            ResultSet rs = stm.executeQuery();
//            while (rs.next()) {
//
//                int id = rs.getInt(1);
//                String pname = rs.getString(2);
//                double price = rs.getDouble(3);
//                int quantity = rs.getInt(4);
//
//                String image = rs.getString(5);
//                String description = rs.getString(6);
//                int cateId = rs.getInt(7);
//                int status = rs.getInt(8);
//
//                System.out.println(new Product(id, pname, price, quantity, image, description, cateId, status));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

//    public void SortProductByName() {
//        try {
//            String sql = "select * from product\n"
//                    + "order by pname";
//            PreparedStatement stm = connection.prepareStatement(sql,
//                    ResultSet.TYPE_SCROLL_SENSITIVE,
//                    ResultSet.CONCUR_UPDATABLE);
//
//            ResultSet rs = stm.executeQuery();
//            while (rs.next()) {
//
//                int id = rs.getInt(1);
//                String pname = rs.getString(2);
//                double price = rs.getDouble(3);
//                int quantity = rs.getInt(4);
//
//                String image = rs.getString(5);
//                String description = rs.getString(6);
//                int cateId = rs.getInt(7);
//                int status = rs.getInt(8);
//
//                System.out.println(new Product(id, pname, price, quantity, image, description, cateId, status));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

//    public void sortProductByPrice() {
//        try {
//            String sql = "select * from product\n"
//                    + "order by price";
//            PreparedStatement stm = connection.prepareStatement(sql,
//                    ResultSet.TYPE_SCROLL_SENSITIVE,
//                    ResultSet.CONCUR_UPDATABLE);
//
//            ResultSet rs = stm.executeQuery();
//            while (rs.next()) {
//
//                int id = rs.getInt(1);
//                String pname = rs.getString(2);
//                double price = rs.getDouble(3);
//                int quantity = rs.getInt(4);
//
//                String image = rs.getString(5);
//                String description = rs.getString(6);
//                int cateId = rs.getInt(7);
//                int status = rs.getInt(8);
//
//                System.out.println(new Product(id, pname, price, quantity, image, description, cateId, status));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    public void DisplayAllProduct() {
     
    }


    public List<Product> DisplayAllProductandCateName(int cateID) {
        List<Product> list  = new ArrayList<>();
       
        try {
            String sql = "select p.id as pid,p.name as pname,price,quantity"
                    + ",imgName,description, p.status as pstatus , c.status as cstatus,c.name as cateName, c.id as cid\n"
                    + "from Product p inner join Category c \n"
                    + "on p.categoryId = c.id\n"
                    + "where p.categoryId = ?";
            PreparedStatement stm = connection.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            stm.setInt(1, cateID);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("pid"));
                p.setName(rs.getString("pname"));
                p.setPrice(rs.getDouble("quantity"));
                p.setImgName(rs.getString("imgName"));
                p.setDescription(rs.getString("description"));
                p.setStatus(rs.getInt("pstatus"));
                Category c = new Category();
                c.setId(rs.getInt("cid"));
                c.setName(rs.getString("cateName"));
                c.setStatus(rs.getInt("cstatus"));
                p.setCategory(c);
                list.add(p);
           

            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  list;
    }

    public static void main(String[] args) {
        ProductDAO pd = new ProductDAO();
        List<Product> p = new ProductDAO().DisplayAllProductandCateName(1);
        System.out.println(p);
    }
}
