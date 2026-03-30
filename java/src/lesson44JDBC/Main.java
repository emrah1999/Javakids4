package lesson44JDBC;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javakids4","root","emrah1907");
            String sql="select * from products";
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("Id: "+ resultSet.getInt("id")+", name: "+resultSet.getString("name")+" price"+ resultSet.getDouble("price"));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
