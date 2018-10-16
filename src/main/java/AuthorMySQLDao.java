import java.sql.*;
import java.util.List;
import com.mysql.cj.jdbc.Driver;


public class AuthorMySQLDao implements Authors {

    Connection connection;
    Config config = new Config();

    public AuthorMySQLDao(){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        }catch (SQLException e){

        }
    }

    @Override
    public List<Author> all() {
        String query = "SELECT * FROM authors";

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){

                System.out.println("rs = " + rs.getLong("id"));
                System.out.println("rs = " + rs.getString("first_name"));
                System.out.println("rs = " + rs.getString("last_name"));

            }
        }catch (SQLException e){

        }

        return null;
    }

    @Override
    public Long insert(Author author) {
        return null;
    }

    @Override
    public Author findOne(long id) {
        return null;
    }
}
