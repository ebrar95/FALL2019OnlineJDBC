package com.jdbc.day1;

import java.sql.*;

public class BasicTest {

    public static void main(String[] args) throws SQLException {

        String URL = "jdbc:oracle:thin:@3.83.178.89:1521:xe";
        String username = "hr";
        String password = "hr";

        Connection connection = DriverManager.getConnection(URL , username , password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employees" );

        while(resultSet.next()){
            System.out.println(resultSet.getString(2));
        }
        resultSet.close();
        statement.close();
        connection.close();


    }


}
