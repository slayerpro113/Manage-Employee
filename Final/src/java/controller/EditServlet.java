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

@WebServlet(name = "EditServlet", urlPatterns = {"/editServlet"})
public class EditServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String idString = request.getParameter("id");
        int id = Integer.valueOf(idString);
        request.setAttribute("id", id);
        String name = request.getParameter("name");
        request.setAttribute("name", name);
        String position = request.getParameter("position");
        request.setAttribute("position", position);
        String email = request.getParameter("email");
        request.setAttribute("email", email);
        String password = request.getParameter("password");
        request.setAttribute("password", password);
        String address = request.getParameter("address");
        request.setAttribute("address", address);
        request.getRequestDispatcher("edit.jsp").forward(request, response);
    }

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
        EmployeeDB employeeDB = new EmployeeDB();
        employeeDB.updateEmployee(employee);

        List<Employee> employees = EmployeeDB.getEmployees();
        request.setAttribute("employees", employees);
        request.getRequestDispatcher("show.jsp").forward(request, response);
    }
}
