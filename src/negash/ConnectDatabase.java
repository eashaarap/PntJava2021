package negash;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectDatabase {
    /**
     * InputStream - abstract class is the superclass of all classes representing an input stream of bytes.
     *
     */

    // to connect we need to declare some public variables
    public static Connection connection = null; //  an interface - connection (session) with a specific database
    public static Statement statement = null;// an interface -  object used for executing a static SQL statement
                                      // and returning the results it produces.
    public static PreparedStatement preparedStatement = null;// an interface extends to Statement - An object that represents a precompiled SQL statement.
    public static ResultSet resultSet = null;// an interface - maintains a cursor pointing  to its current row of data.
    public static String filePath = "../ProjectSolo/External_Liberary/Properties_files/DontTell.properties"; // to hold the path

    //first we need to get the data we have in our properties file to use them for connection
    public static Properties loadProperties(String filePath) throws IOException {
        Properties properties = new Properties();// instantiate the properties class
        InputStream inputStream = new FileInputStream(filePath);// use of inputStream
        properties.load(inputStream);// now we can use our properties object
        inputStream.close();
        return properties;
    }

    // now we can connect to our database using the loadProperties method
    public static Connection connectToMySQL() throws IOException, ClassNotFoundException, SQLException {
        Properties prop = ConnectDatabase.loadProperties(filePath);// using my loadProperties method
        String driver = prop.getProperty("MYSQLJDBC.driver") ; // declare driver variable and use my object prop declared above
        String user = prop.getProperty("MYSQLJDBC.userName")  ;// declare user variable and use my object prop declared above
        String password = prop.getProperty("MYSQLJDBC.password");// declare password variable and use my object prop declared above
        String url = prop.getProperty("MYSQLJDBC.url") ;        // declare url variable and use my object prop declared above
        Class.forName(driver);
        connection = DriverManager.getConnection(url,user,password);
        statement = connection.createStatement();
        return connection;

    }

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        ConnectDatabase.connectToMySQL();
    }// end of main

}// end of line
