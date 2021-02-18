package RetosPush;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectionDatabaseMrHasan {
    public static String filePath = "../Practice/SecretProperties/Secret.properties";
    public static Connection myCon = null;
    public static Statement myStatement = null;
    public static ResultSet resultSet = null;

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

        //ConnectionDatabaseMrHasan.connectionToMYSQL();
        readDatabase("tutoring_squad","frnd_Salary");

    }//main

    //properties method
    ////first we need to get the data we have in our properties file to use them in our connection
    public static Properties loadProperty(String filePath) throws IOException {//we use the property class here because we r going to return our properties so that I can use this in my next method
        Properties property = new Properties();
        FileInputStream inputStream = new FileInputStream(filePath);
        property.load(inputStream);//load properties from secret.properties
        inputStream.close();
        return property;// return properties
    }

    //Database Connection
    // now we can connect to our database using the loadProperties method
    public static Connection connectionToMYSQL() throws ClassNotFoundException, SQLException, IOException {//We r using the Connection class here
        Properties prop = ConnectionDatabaseMrHasan.loadProperty(filePath);//load "loadProperty" method we created inside our connection method
        //get details from secret.property
        String driver = prop.getProperty("MYSQLJDBC.driver"); // declare driver variable and use my object prop declared above
        String user = prop.getProperty("MYSQLJDBC.userName");// declare user variable and use my object prop declared above
        String password = prop.getProperty("MYSQLJDBC.password");// declare password variable and use my object prop declared above
        String url = prop.getProperty("MYSQLJDBC.url");        // declare url variable and use my object prop declared above
        Class.forName(driver);//register the driver
        myCon = DriverManager.getConnection(url, user, password);//so i need to provide my info to connect
        myStatement = myCon.createStatement();
        System.out.println("DataBase Connected Successfully");
        return myCon;// return connection

    }

    // If we don’t close our open connections, we might leave open windows for hackers to manipulate our database
    // and memory cache will consume unnecessary resource
    public static void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (myStatement != null) {
                myStatement.close();
            }
            if (myCon != null) {
                myCon.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    // this method will show us what we have retrieve from our data
    //this method will get the data from a particular column
    //so this is our helper method which will help us to read the data
    public static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException {
        //since it is an array type of method let me declare an array list to accept the incoming array data
        List<String> dataList = new ArrayList<>();// declaring an array named dataList
        while (resultSet.next()) {                 // when the resultSet next has data
            String itemList = resultSet.getString(columnName);// get the data from the column and put in itemList
            dataList.add(itemList);             // and add the itemList into the array I declared earlier [dataList]
        }
        return dataList;                        // finally give me back my array

    }

    //this method will help us read the data from our database
    //first we connect to databse--> so we will use our "connectionToMYSQL" method we created above
    public static List<String> readDatabase(String tableName, String columnName) {
        List<String> data = new ArrayList<>();
        try {
            ConnectionDatabaseMrHasan.connectionToMYSQL();// we use the "connectionToMYSQL" method to connect since we alread have th code on how to connect in that method
            // so to read our databse,load porperties then we connect, then create statement, then resultset to store our statements and execute our query to display our table info in the console
            myStatement = myCon.createStatement();//The object used for executing a static SQL statement and returning the results it produces.
            //// Let us select all the records and display them.
            resultSet = myStatement.executeQuery("Select * From "+tableName);//Use this method when you expect to get a result set, as you would with a SELECT statement.
            data = ConnectionDatabaseMrHasan.getResultSetData(resultSet,columnName);// I want to read all the data in my data list

            //to print all the value--> for each loop
            for(String dt : data) {
                System.out.println(dt);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            ConnectionDatabaseMrHasan.close();
        }
        return data;
    }





}//end
