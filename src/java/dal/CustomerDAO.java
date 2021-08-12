/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import dal.DBContext;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;

/**
 *
 * @author xuanh
 */
public class CustomerDAO extends DBContext {

    public int addCustomer(Customer c) {
        int n = 0;
        try {

            String sql = "insert into Customer"
                    + "(cname,cphone,cAddress,username,password)\n"
                    + "values(?,?,?,?,?)";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, c.getCname());
            stm.setString(2, c.getCphone());
            stm.setString(3, c.getcAddress());
            stm.setString(4, c.getUsername());
            stm.setString(5, c.getPassword());

            n = stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int UpdateCustomer(String cid, Customer c) {
        int n = 0;
        try {

            String sql = "update Customer set "
                    + "cname=?,cphone=?,cAddress=?,username=?,password=?,status=? "
                    + "where cid=? ";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, c.getCname());
            stm.setString(2, c.getCphone());
            stm.setString(3, c.getcAddress());
            stm.setString(4, c.getUsername());
            stm.setString(5, c.getPassword());
            stm.setInt(6, c.getStatus());
            stm.setString(7, cid);
            n = stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int changeStatus(int cid, int status) {
        int n = 0;
        String preSql = "update Customer set status=? where cid=?";

        try {
            PreparedStatement pre = connection.prepareStatement(preSql);
            pre.setInt(1, status);
            pre.setInt(2, cid);
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public int changePassword(int cid, String username,
            String oldpass, String newPass) {
        int n = 0;

        // check pass and repass -- javascript
        // check account (username, oldpass)
        String checksql = "select * from Customer where username='" + username + "'"
                + " and password='" + oldpass + "'";
        ResultSet rs = this.getData(checksql);
        try {
            if (!rs.next()) {
                System.out.println("account don't exist");
                return n;
            }

            // check OK
            String sql = "update Customer set password=? where cid=?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, newPass);
            stm.setInt(2, cid);
            n = stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        // check OK
        return n;
    }

    public int DeleteCustomerbyCid(String cid) {
        int n = 0;
        try {

            String sql = "delete from Customer where cid LIKE ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, cid);
            n = stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public List<Customer> getAll() {

        String query = "SELECT * FROM Customer";
        List<Customer> ls = new ArrayList<>();

        try (
                PreparedStatement ps = connection.prepareStatement(query)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer c = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getInt(7));
                ls.add(c);

            }
            return ls;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
//NEED TO EDIT

    public Customer getOne(int cid) {

        String sql = "SELECT * FROM Customer WHERE cid = ?";
        Customer c = new Customer();
        try (
                PreparedStatement stm = connection.prepareStatement(sql)) {
            stm.setInt(1, cid);

            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
              
                stm.setString(1, c.getCname());
                stm.setString(2, c.getCphone());
                stm.setString(3, c.getcAddress());
                stm.setString(4, c.getUsername());
                stm.setString(5, c.getPassword());
                stm.setInt(6, c.getStatus());
                stm.setInt(7, cid);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;

    }

    public void findCustomerByName(String name) {

        try {
            String sql = "Select * from Customer where cname like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, name);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                String cid = rs.getString(1);

                String cname = rs.getString(2);
                String cphone = rs.getString(3);
                String caddress = rs.getString(4);
                String username = rs.getString(5);
                String password = rs.getString(6);
                int status = rs.getInt(7);

                System.out.println(new Customer(cid, cname, cphone, caddress, username, password, status));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SortCustomerByName() {
        try {
            String sql = "select * from Customer order by cname ";

            PreparedStatement stm = connection.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                String cid = rs.getString(1);

                String cname = rs.getString(2);
                String cphone = rs.getString(3);
                String caddress = rs.getString(4);
                String username = rs.getString(5);
                String password = rs.getString(6);
                int status = rs.getInt(7);

                System.out.println(new Customer(cid, cname, cphone, caddress, username, password, status));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int DeleteCustomerbyPid(String id) {
        int n = 0;
        try {

            String sql = "delete from Customer where cid like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, id);
            n = stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public static void main(String[] args) {
        CustomerDAO cusDB = new CustomerDAO();
        System.out.println(cusDB.getOne(1));

    }
}
