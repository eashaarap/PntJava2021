package databaseconnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class connectDatabaseGroupDiscussion {
    //step 1
    //declare your filePath to access properties which is in our 'Secret.Properties' file
    public static String filePath = "../PntSession/ExtLibrary/Properties/Secret.properties";
    public static Connection connection = null;//initializing to null because at the moment we dont have a connection
    public static Statement myStatement = null;

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

        connectDatabaseGroupDiscussion.connectToMySql();

    }//end of main

    //step 2:
    //first we need to load data from our secret.properties file
     //create Properties method:
    public static Properties loadProperties(String filePath) throws IOException {// in order to get our properties we need to pass our path
        Properties prop = new Properties(); // in order to use properties class must instantiate

        // in order to have access to our file path we must use input stream
        FileInputStream input = new FileInputStream(filePath);

        //now we need to load our properties object
        prop.load(input);

        //close input stream
        input.close();

        //return
        return prop;

    }//end of loadProperties method

    //step 3:
        //declare Connection method to help us connect
    public static Connection connectToMySql() throws IOException, ClassNotFoundException, SQLException {
        // in order to connect first you need to make a connection w/ Properties method to Connection method
        Properties property = connectDatabaseGroupDiscussion.loadProperties(filePath);

        //now we need to get the data that we have in our Secret.Properties file, we need in order to connect
        String url = property.getProperty("MYSQLJDBC.url");
        String userName = property.getProperty("MYSQLJDBC.userName");
        String password = property.getProperty("MYSQLJDBC.password");
        String driver = property.getProperty("MYSQLJDBC.driver");

        //registering the driver in order to drive the properties: Class.forName();
        Class.forName(driver);

        //we have url, username, password, nowwwwww we need to connect
        connection= DriverManager.getConnection(url,userName, password);

        //we need to use Statement class in order to execute queries
                //in order to use statement we need to connect it to Connection class
        //Statement = queries
        myStatement=connection.createStatement();

        System.out.println("We connected hurrayyy!!!");

        return connection;



    }
}
