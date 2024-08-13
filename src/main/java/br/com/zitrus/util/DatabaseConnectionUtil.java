package br.com.zitrus.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionUtil {
    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver"; // Driver Oracle
    private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xe"; // URL do Oracle XE
    private static final String USER = "SYSTEM";
    private static final String PASS = "123";

    public static boolean testDatabaseConnection() {
        try {
            // Carrega o driver JDBC do Oracle
            Class.forName(JDBC_DRIVER);

            // Obtém uma conexão com o banco de dados
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
                return true; // Conexão bem-sucedida
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Falha na conexão
    }
}