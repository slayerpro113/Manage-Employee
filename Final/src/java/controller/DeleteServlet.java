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
import org.apache.tomcat.jni.User;

@WebServlet(name = "DeleteServlet", urlPatterns = {"/deleteServlet"})
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idString = request.getParameter("id");
        int id = Integer.valueOf(idString);
        
        EmployeeDB employeeDB = new EmployeeDB();
        employeeDB.deleteEmployee(id);
        
        List<Employee> employees = EmployeeDB.getEmployees();
        request.setAttribute("employees", employees);
        request.getRequestDispatcher("show.jsp").forward(request, response);
    }

}
