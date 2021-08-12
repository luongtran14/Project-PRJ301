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

import model.Brand;

/**
 *
 * @author AnhDT
 */
public class BrandDao extends DBContext {

    public List<Brand> getAll() {

        String query = "SELECT * FROM brand";
        List<Brand> ls = new ArrayList<>();

        try (
                PreparedStatement ps = connection.prepareStatement(query)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new model.Brand(rs.getInt(1), rs.getString(2), rs.getInt(3));

                ls.add(brand);
            }
            return ls;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public Brand getOne(int id) {

        String query = "SELECT * FROM brand WHERE id = ?";

        try (
                PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Brand brand = new model.Brand(rs.getInt(1), rs.getString(2), rs.getInt(3));

                return brand;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new BrandDao().getOne(1));
    }
}
