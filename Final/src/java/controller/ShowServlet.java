/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelBO.Employee;
import modelDAO.EmployeeDB;

@WebServlet(name = "ShowServlet", urlPatterns = {"/showServlet"})
public class ShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      List<Employee> employees = EmployeeDB.getEmployees();
        request.setAttribute("employees", employees);
        request.getRequestDispatcher("show.jsp").forward(request, response);
    }
}
