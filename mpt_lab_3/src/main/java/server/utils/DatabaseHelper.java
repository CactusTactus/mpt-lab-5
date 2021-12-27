package server.utils;


import server.entities.EstateAgent;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseHelper {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String HOST = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE = "real_estate_agency";
    private static final String USER = "root";
    private static final String PASSWORD = "12345qwerty";

    private static Connection getDatabaseConnection() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
            return DriverManager.getConnection(HOST + DATABASE, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public static EstateAgent getEstateAgentById(int estateAgentId) {
        String query = "SELECT * FROM estate_agent WHERE estate_agent_id = ?";
        Connection connection = getDatabaseConnection();
        try {
            if (connection != null) {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, estateAgentId);
                ResultSet resultSet = preparedStatement.executeQuery();
                resultSet.next();

                int id = resultSet.getInt("estate_agent_id");
                String name = resultSet.getString("name");
                int salary = resultSet.getInt("salary");
                boolean isActive = resultSet.getInt("is_active") == 1;

                resultSet.close();
                preparedStatement.close();
                connection.close();

                return new EstateAgent(id, name, salary, isActive);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static ArrayList<EstateAgent> getEstateAgents() {
        System.out.println("getEstateAgents");
        String query = "SELECT * FROM estate_agent";
        ArrayList<EstateAgent> estateAgents = new ArrayList<>();
        try {
            Connection connection = getDatabaseConnection();
            if (connection != null) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    int id = resultSet.getInt("estate_agent_id");
                    String name = resultSet.getString("name");
                    int salary = resultSet.getInt("salary");
                    boolean isActive = resultSet.getInt("is_active") == 1;
                    estateAgents.add(new EstateAgent(id, name, salary, isActive));
                }

                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return estateAgents;
    }
}
