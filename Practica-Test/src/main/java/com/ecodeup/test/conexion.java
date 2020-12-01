package com.ecodeup.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {

    private String jdbcUrl;
    private String jdbcUserName;
    private String jdbcPassword;
    private Connection jdbcConnection;

    public conexion(String jdbcUserName, String jbdcUrl, String jbdcPassword, Connection jdbcConnection) {
        this.jdbcUserName = jdbcUserName;
        this.jdbcUrl = jbdcUrl;
        this.jdbcPassword = jbdcPassword;
        this.jdbcConnection = jdbcConnection;
    }

    public Connection getJdbcConnection() {
        return jdbcConnection;
    }

    public void connection(String e) throws SQLException {

        if (jdbcConnection.equals(null) || jdbcConnection.isClosed()) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {

                throw new SQLException(e);

            }

            jdbcConnection = DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPassword);
        }
    }

    public void disconnets() throws SQLException {

        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();

        }

    }

}
