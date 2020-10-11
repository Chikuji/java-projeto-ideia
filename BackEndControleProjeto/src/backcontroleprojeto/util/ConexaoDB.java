package backcontroleprojeto.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoDB {
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/dbcontproj?useTimezone=true&serverTimezone=UTC";    
            String usuario = "root";
            String senha = "pass123";
            return DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}