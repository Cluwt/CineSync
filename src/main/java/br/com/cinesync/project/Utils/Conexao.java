package br.com.cinesync.project.Utils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/CineSync";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver"; // Use esta classe de driver para MySQL 8

    private static final HikariConfig config = new HikariConfig();

    static {
        config.setJdbcUrl(JDBC_URL);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        config.setDriverClassName(DRIVER_CLASS_NAME); // Configura o nome da classe do driver JDBC
        // Configurações adicionais, se necessário
    }

    private static final HikariDataSource dataSource = new HikariDataSource(config);

    public static Connection obterConexao() throws SQLException {
        Connection conexao = dataSource.getConnection();
        System.out.println("---------------------------------------------");
        System.out.println("A conexão com o banco de dados foi realizada!");
        System.out.println("---------------------------------------------");
        return conexao;
    }
}
