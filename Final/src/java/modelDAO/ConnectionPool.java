
package modelDAO;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionPool {
    public static Connection getConnection(){
        try{
            InitialContext ctx = new InitialContext();
            DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/employee");
            return ds.getConnection();
        } catch (NamingException | SQLException ex){
            return null;
        }
    }
}
