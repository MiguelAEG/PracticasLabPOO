/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testlibrary;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import dbc.DbConnection;

/**
 *
 * @author A
 */
public class TestLibrary {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        try {
            DbConnection db = new DbConnection();
            Connection conn = db.getConnection("jdbc:mysql://localhost:3306/world", "root", "Miguel12");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM country");
            while (rs.next()) {
                System.out.println(rs.getString("Name"));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TestLibrary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
