import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class TestJDBC {

    public static void main(String[] args) {

        String selectQuery = "SELECT * FROM posts where id = 1";

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = null;
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/blog_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            rs.next();
            System.out.println("Here's an post:");
            System.out.println("  id: " + rs.getLong("id"));
            System.out.println("  title: " + rs.getString("title"));

//            while (rs.next()) {
//                System.out.println("Here's an post:");
//                System.out.println("  id: " + rs.getLong("id"));
//                System.out.println("  title: " + rs.getString("title"));
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
