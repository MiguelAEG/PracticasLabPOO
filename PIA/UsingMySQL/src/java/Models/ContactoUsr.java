/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.*;

/**
 *
 * @author A
 */
public class ContactoUsr {
    private String fname;
    private String lname;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    // constructor from resultset
    public static ContactoUsr fromResultSet(ResultSet rs) throws SQLException {
        ContactoUsr usr = new ContactoUsr();
        usr.setFname(rs.getString("fname"));
        usr.setLname(rs.getString("lname"));
        return usr;
    }
}
