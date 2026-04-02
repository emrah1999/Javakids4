package lesson45JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main3 {
    public static void main(String[] args) {
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javakids4","root","emrah1907");

            String sql="create table if not exists clients(id int primary key auto_increment "+
                    ", name varchar(55),surname varchar(100), birthdate date,"+
                    "created_at timestamp default current_timestamp)";
            connection.createStatement().executeUpdate(sql);

            String sql2 = "insert into clients(name,surname,birthdate) values('Emrah','Yildiz','1990-07-19')";
            connection.createStatement().executeUpdate(sql2);

            String sql3="select * from clients";
            ResultSet result=connection.createStatement().executeQuery(sql3);

            while (result.next()){
                System.out.println("Id: "+ result.getInt("id")+", name: "+result.getString("name")+" surname: "+result.getString("surname")+
                        " birthdate: "+result.getDate("birthdate")+" created at: "+result.getTimestamp("created_at"));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
