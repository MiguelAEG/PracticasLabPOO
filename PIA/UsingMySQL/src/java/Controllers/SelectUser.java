/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Models.ContactoUsr;
import dbc.DbConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A
 */
public class SelectUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException      if a servlet-specific error occurs
     * @throws IOException           if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        ContactoUsr usr = new ContactoUsr();
        DbConnection db = new DbConnection();

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcessModel</title>");
            out.println("</head>");
            out.println("<body>");

            Connection conn = db.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "Miguel12");
            usr.setFname(request.getParameter("fnamesel"));
            usr.setLname(request.getParameter("lnamesel"));

            out.println("<h1>Servlet ProcessModel at " + request.getContextPath() + "</h1>");
            out.println("<h1>First Name: " + usr.getFname() + "</h1>");
            out.println("<h1>Last Name: " + usr.getLname() + "</h1>");

            Statement stmt = conn.createStatement();
            // select the user with the given first and last name
            String sql = "SELECT * FROM user WHERE fname = '" + usr.getFname() + "' AND lname = '" + usr.getLname()
                    + "'";
            
            ResultSet rs = stmt.executeQuery(sql);
            // if the user exists, print the user's information
            while (rs.next()) {
                ContactoUsr user = ContactoUsr.fromResultSet(rs);
                out.println("<h1>Usuario encontrado: " + user.getFname() + user.getLname() + "</h1>");
            }

            conn.close();

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ProcessModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ProcessModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
