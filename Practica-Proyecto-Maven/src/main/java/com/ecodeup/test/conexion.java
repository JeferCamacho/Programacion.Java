package com.ecodeup.test;

import java.sql.Connection;

public class conexion {

    private String userName;
    private String password;
    private String url;
    private Connection conexion;

    public conexion(String userName, String password, String url) {
        this.userName = userName;
        this.password = password;
        this.url = url;

    }

    public void connection() {

    }

}
