package lesson45JDBC2;

import java.sql.*;

public class Main2 {
    public static void main(String[] args) {
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javakids4","root","emrah1907");
            String sql="select products.id,products.name as product_name,products.price,"+
                    "categories.name as category_name from products inner  join categories on products.category_id=categories.id";

            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);

            while(resultSet.next()){
                System.out.println("Id:"+ resultSet.getInt("id")+", name: "+resultSet.getString("product_name")+
                        ", price: "+resultSet.getDouble("price")+", category: "+resultSet.getString("category_name"
                    ));
            }


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
