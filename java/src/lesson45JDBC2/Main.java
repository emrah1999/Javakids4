package lesson45JDBC2;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javakids4","root","emrah1907");
//            String sql="insert products(name,price,category_id) values('Alca',11.2,3)";
//            Statement statement=connection.createStatement();
//            int result = statement.executeUpdate(sql);
//            System.out.println(result);

            update("Armud",12.5,4);
            delete(4);


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void update(String name,double price,int id){
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javakids4","root","emrah1907");
            String sql="update  products set name='"+name+"',price="+price+" where id="+id;
            Statement statement=connection.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println(result);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void delete(int id){
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javakids4","root","emrah1907");
            String sql="delete from  products  where id="+id;
            Statement statement=connection.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println(result);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
