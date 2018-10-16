import java.sql.*;
import java.util.ArrayList;
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
        List<Author> authors = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
               authors.add(createAuthorObj(rs)
               );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return authors;
    }

    public Author createAuthorObj(ResultSet rs){
        try {
            return new Author(rs.getLong("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Long insert(Author author) {
        String query = String.format("insert into authors(first_name, last_name) values('%s','%s')", author.getFirst_name(), author.getLast_name());
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate( query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
                return rs.getLong(1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public Author findOne(long id) {
        //SELECT * FROM authors where id = 4;
        Author author = null;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM authors where id = " + id);
            rs.next();
            author = createAuthorObj(rs);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return author;
    }
}
