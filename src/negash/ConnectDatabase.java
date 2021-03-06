package negash;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        ConnectDatabase.connectToMySQL();
    }// end of main

    /**
     * Method to load personal propertied - need a file path
     * Searches for the property with the specified key in this property list.
     * If the key is not found in this property list, the default property list,
     * and its defaults, recursively, are then checked. T
     * he method returns null if the property is not found.
     * Params:  key – the property key.
     * Returns: the value in this property list with the specified key value.
     * @param filePath
     * @return
     * @throws IOException
     */
    public static Properties loadProperties(String filePath) throws IOException {
        Properties properties = new Properties();// instantiate the properties class
        InputStream inputStream = new FileInputStream(filePath);// use of inputStream
        properties.load(inputStream);// now we can use our properties object
        inputStream.close();
        return properties;
    }

    // now we can connect to our database using the loadProperties method
    /**
     * A connection (session) with a specific database. SQL statements are executed and results are returned
     * within the context of a connection. A Connection object's database is able to provide information
     * describing its tables, its supported SQL grammar, its stored procedures, the capabilities of this connection,
     * and so on. This information is obtained with the getMetaData method.
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection connectToMySQL() throws IOException, ClassNotFoundException, SQLException {
        Properties prop = ConnectDatabase.loadProperties(filePath);// using my loadProperties method
        String driver = prop.getProperty("MYSQLJDBC.driver") ; // declare driver variable and use my object prop declared above
        String user = prop.getProperty("MYSQLJDBC.userName")  ;// declare user variable and use my object prop declared above
        String password = prop.getProperty("MYSQLJDBC.password");// declare password variable and use my object prop declared above
        String url = prop.getProperty("MYSQLJDBC.url") ;        // declare url variable and use my object prop declared above
        // registration of the driver
        /** why we use Class.forName
         * Returns the Class object associated with the class or interface with the given string name.
         * Invoking this method is equivalent to:  Class.forName(className, true, currentLoader)
         */
        Class.forName(driver);
        connection = DriverManager.getConnection(url,user,password);
        statement = connection.createStatement();
        return connection;
    }

    // If we don’t close our open connections, we might leave open windows for hackers to manipulate our database
    // and memory cache will consume unnecessary resource
    public static void close(){
        try {
            if (connection != null){
                connection.close();  }
            if (statement != null){
                statement.close();  }
            if (resultSet != null){
                resultSet.close();  }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // this method will show us what we have retrieve from our data
    public static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException {
        //since it is an array type of method let me declare an array list to accept the incoming array data
        List<String> dataList = new ArrayList<>();// declaring an array named dataList
        while (resultSet.next()){                 // when the resultSet next has data
            String itemList = resultSet.getString(columnName);// get the data from the column and put in itemList
            dataList.add(itemList);             // and add the itemList into the array I declared earlier [dataList]
        }
        return dataList;                        // finally give me back my array

    }


}// end of line
