package org.example.lab3;

import java.sql.*;

public class DbConnect {
    public static void main(String[] args) throws SQLException {
        DbConnect db = new DbConnect();
        //db.getAllTasks();

        db.getTaskById(1);
    }
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "sorry i'm not giving you my password uwu";

    private Connection connection = null;

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // TODO Fetch all task entities from the database.

    public void getAllTasks() throws SQLException {
        Statement useStatement = this.connection.createStatement();
        useStatement.execute("USE lab3;");
        useStatement.close();

        PreparedStatement statement = this
                .connection
                .prepareStatement("SELECT * FROM tasks;");
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }
    }

    // TODO Fetch a specific task entity by its ID.
    public void getTaskById(int taskId) throws SQLException {
        Statement useStatement = this.connection.createStatement();
        useStatement.execute("USE lab3;");
        useStatement.close();

        PreparedStatement statement = this
                .connection
                .prepareStatement("SELECT * FROM tasks WHERE id = ?");
        statement.setInt(1, taskId);
        ResultSet rs = statement.executeQuery();

        while (rs.next()){
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }
    }
}

