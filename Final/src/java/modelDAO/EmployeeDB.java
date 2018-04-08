/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelBO.Employee;
import org.apache.tomcat.jni.User;

public class EmployeeDB {

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        Connection connection = ConnectionPool.getConnection();
        try {
            String sql = "Select * From employee";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String address = rs.getString("address");
                String position = rs.getString("position");
                Employee employee = new Employee(id, name, email, password, address, position);
                employees.add(employee);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return employees;
    }

    public static boolean addEmployee(Employee employee) {
        boolean t = true;
        Connection connection = ConnectionPool.getConnection();
        String sql = "Insert into employee(id, name, email, password, address, position) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setString(3, employee.getEmail());
            ps.setString(4, employee.getPassword());
            ps.setString(5, employee.getAddress());
            ps.setString(6, employee.getPosition());
            ps.executeUpdate();
            t = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return t;
    }

    public static void updateEmployee(Employee employee) {
        Connection connection = ConnectionPool.getConnection();
        String url = "Update employee set name = ?, position=? , email = ?, password =?, address=? where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(url);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getPosition());
            ps.setString(3, employee.getEmail());
            ps.setString(4, employee.getPassword());
            ps.setString(5, employee.getAddress());
            ps.setInt(6, employee.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void deleteEmployee(int id) {
        Connection connection = ConnectionPool.getConnection();
        String sql = "Delete From employee where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static Employee getEmployeeByEmail(String emailLogin) {
        Connection connection = ConnectionPool.getConnection();
        String sql = "SELECT name, email, password FROM final.employee where email=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, emailLogin);
            ResultSet rs = ps.executeQuery();
            Employee employee = new Employee();
            if (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                employee.setName(name);
                employee.setEmail(email);
                employee.setPassword(password);
                
                return employee;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

}
