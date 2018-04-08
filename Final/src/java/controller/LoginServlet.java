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

@WebServlet(name = "LoginServlet", urlPatterns = {"/loginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Employee employee = EmployeeDB.getEmployeeByEmail(email);

        if(employee == null){
            String errorMessage = "Incorrect email, check again !!!";
            request.setAttribute("errorMessage", errorMessage);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else if(!employee.getPassword().equals(password)) {
            String errorMessage = "Incorrect password, check again !!!";
            request.setAttribute("errorMessage", errorMessage);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        else{
            request.setAttribute("employee", employee);
            List<Employee> employees = EmployeeDB.getEmployees();
            request.setAttribute("employees", employees);
            request.getRequestDispatcher("show.jsp").forward(request, response);
        } 
    }
}
