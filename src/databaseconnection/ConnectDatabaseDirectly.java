package databaseconnection;

import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.*;
import java.util.ArrayList;

public class ConnectDatabaseDirectly {
    /*
    Key = Value
    JDBC Connection
    URL Syntax: protocol//[hosts][/database][?properties]
    https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html
     */
    public static void main(String[] args) throws SQLException {
                                    //localost:port#/databaseName+IfYouHaveProperties
        String url = "jdbc:mysql://localhost:3306/pnt_selenium?serverTimezone=UTC";
        String user = "root";
        String password = "password";

        Connection connection = null;
        Statement statement = null;


        Movie titanic = new Movie(1, "Titanic", 1997, "Romance","PG 13", "Lan Favieu" );
        Movie lionKing = new Movie(2, "Lion King", 1994, "Drama", "PG 13", "Don Landie");
        Movie theNotebook = new Movie(3, "Notebook", 2001, "Romance", "PG 13","Arthur Daniel" );

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(titanic);
        movies.add(lionKing);
        movies.add(theNotebook);

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            for(Movie mv: movies){
                String query = "insert into movie(id, title, releaseYear, genre, mpaRating, producer)"
                    + "values("+mv.getId()+",'"+mv.getTitle()+"',"+mv.getReleaseYear()+",'"+mv.getGenre()+"','"+mv.getMpaRating()+
                        "','"+mv.getProducer()+"')";
            }

//            String query = "select * from students";
//            statement.execute(query);
        }catch(SQLDataException e){
            e.printStackTrace();
        }finally{
            statement.close();
            connection.close();

        }

    }
}
