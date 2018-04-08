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

@WebServlet(name = "AddServlet", urlPatterns = {"/addServlet"})
public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String idString = request.getParameter("id");
        String name = request.getParameter("name");
        String position = request.getParameter("position");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        int id = Integer.valueOf(idString);
        
        Employee employee = new Employee(id, name, email, password, address, position);
        try {
            EmployeeDB employeeDB = new EmployeeDB();
            employeeDB.addEmployee(employee);
        } catch (Exception e) {
            System.out.println(e);
        }

        List<Employee> employees = EmployeeDB.getEmployees();
        request.setAttribute("employees", employees);
        request.getRequestDispatcher("show.jsp").forward(request, response);
    }
}
