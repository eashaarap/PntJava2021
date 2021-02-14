package databaseconnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectDatabase {

    //Secret.properties file
    //jdbc driver
    //jdbc url
    //config jdbc
    //mySql Query

    public static Connection connection = null;
    public static Statement statement = null;
    public static PreparedStatement preparedStatement= null;
    public static ResultSet resultSet=null;
    public static String filePath="../PntSession/ExtLibrary/Properties/Secret.properties";

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        //ConnectDatabase.connectToSQLDatabase();
        ConnectDatabase.readDatabase("movie", "title");
    }

    //Load Properties
    public static Properties loadProperties(String filePath) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        inputStream.close();
        return properties;
    }
    //Database Connection
    public static Connection connectToSQLDatabase() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = ConnectDatabase.loadProperties(filePath);
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String user = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();
        System.out.println("Database is connected successfully");
        return connection;
    }
    public static void close() throws SQLException {
        try{
            if (resultSet !=null){
                resultSet.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connection !=null){
                connection.close();
            }
        }catch(SQLDataException throwables){
            throwables.printStackTrace();
        }
    }

    public static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException{
        List<String> dataList = new ArrayList<>();
        while(resultSet.next()){
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }
    public static List<String> readDatabase(String tableName, String columnName) throws SQLException {
        List<String> data = new ArrayList<>();
        try{
            ConnectDatabase.connectToSQLDatabase();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from"+tableName);
            data = ConnectDatabase.getResultSetData(resultSet, columnName);
            for(String dt:data){
                System.out.println(dt+ " ");
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }catch(ClassNotFoundException f){
            f.printStackTrace();
        }finally{
            ConnectDatabase.close();
        }
        return data;
    }
}
