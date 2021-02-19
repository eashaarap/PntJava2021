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
    public static PreparedStatement preparedStatement = null;

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

        //ConnectionDatabaseMrHasan.connectionToMYSQL();
       //ConnectionDatabaseMrHasan.readDatabase("tutoring_squad","frnd_Salary");
        //ConnectionDatabaseMrHasan.insertDataFromStringToSQLTable("Islam","tutoring_squad","frnd_LastName");
        //ConnectionDatabaseMrHasan.insertDataFromStringToSQLTable("bob","students","first_name");
        //ConnectionDatabaseMrHasan.insertDataFromStringToSQLTable("Mahirul","employees2demo","first_name");
//        int[] numbers ={23,45,67,34,78,89};
//        ConnectionDatabaseMrHasan.insertDataFromArrayToSqlTable(numbers,"productDetails","ProductDeets");

        //ConnectionDatabaseMrHasan.insertDataFromStringToSQLTable1("bob",249000,"tutoring_squad","frnd_FirstName","frnd_Salary");
        ConnectionDatabaseMrHasan.insertDataFromStringToSQLTable2("Something","Farhana Afu","tutoring_squad","frnd_LastName","frnd_FirstName");


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



    /**
     * A ResultSet object is a table of data representing a database result set,
     * which is usually generated by executing a statement that queries the database.
     * For example, the CoffeeTables.viewTable method creates a ResultSet, rs,
     * when it executes the query through the Statement object, stmt.
     * Note that a ResultSet object can be created through any object
     * that implements the Statement interface, including PreparedStatement,
     * CallableStatement, and RowSet.
     * @param resultSet
     * @param columnName
     * @return
     * @throws SQLException
     */
// this method will show us what we have retrieve from our data
    //this method will get the data from a particular column
    //so this is our helper method which will help us to read the data
    //getResultSetData will return a array and what type of array- a list type of array
    //ResultSet is a interface--> it will take the result set type of value from the user
    public static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException {
        //since it is an array type of method let me declare an array list to accept the incoming array data
        List<String> dataList = new ArrayList<>();// declaring an array named dataList
        // before we add input in the datalist by doing datalist.add("value")
        //since this a dynamic method, we dont want to add value to our array like before

        while (resultSet.next()) {                 // when the resultSet next has data

            String itemList = resultSet.getString(columnName);// get the data from the columnName during run time and hold it in itemList
            dataList.add(itemList);             // and add the itemList into the array I declared earlier [dataList]
        }// we used while loop because we want to add multiple data
        //while loop will help us to get the data from the column by keep on movingb to the next value
        return dataList;                        // return list string type data

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
            resultSet = myStatement.executeQuery("Select * From "+tableName);//you want to store the quieries/statements in the result set , as you would with a SELECT statement.
            data = ConnectionDatabaseMrHasan.getResultSetData(resultSet,columnName);// I want to read all the data from my column in my data list
            //since i am using the "getResultSetData method()" I have to pass two arguments

            //to print all the value from that column--> for each loop
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

    /**
     * PreparedStatement allows you to write a dynamic and parametric query.
     By using PreparedStatement in Java you can write parameterized
     SQL queries and send different parameters by using the same SQL queries
     which is a lot better than creating different queries.
     The PreparedStatement interface is a subinterface of Statement.
     It is used to execute parameterized query.

     Prepared Statement queries are pre-compiled on the database and
     their access plan will be reused to execute further queries which
     allow them to execute much quicker than normal queries generated by
     Statement object.

     Let's see the example of parameterized query:

     String sql="insert into emp values(?,?,?)";
     As you can see, we are passing parameter (?) for the values.
     Its value will be set by calling the setter methods of
     PreparedStatement.
     */

    public static void insertDataFromStringToSQLTable(String data, String tableName, String columnName){
        try {
            connectionToMYSQL();
            preparedStatement = myCon.prepareStatement("Insert into " + tableName + " ( " + columnName + ") values (?)");// ? means u dont know the value, if u have multiple column then u will use multiple ? mark, we have one column we r passing so we use one ? mark
            preparedStatement.setString(1,data);// parameterIndex-->which column to insert the value, and data-->what information you want to insert
            preparedStatement.executeUpdate();// We r updating our table so thats why we use "executeUpdate"


        }catch (IOException | ClassNotFoundException | SQLException ioException){

        }
    }
    public static void insertDataFromStringToSQLTable1(String data,int num, String tableName, String columnName, String column2) {
        try {
            connectionToMYSQL();
            preparedStatement = myCon.prepareStatement("Insert into " + tableName + " ( " + columnName + "," + column2 + ") values (?,?)");// ? means u dont know the value, if u have multiple column then u will use multiple ? mark, we have one column we r passing so we use one ? mark
            preparedStatement.setString(1, data);// parameterIndex-->which column to insert the value, and data-->what information you want to insert
            //parameter index correlates to the column names in the order we write in the query... ex. parameterIndex:1-->columnName, parameterIndex:2-->column2
            preparedStatement.setInt(2, num);
            preparedStatement.executeUpdate();// We r updating our table so thats why we use "executeUpdate"


        } catch (IOException | ClassNotFoundException | SQLException ioException) {

        }
    }

        public static void insertDataFromStringToSQLTable2(Object data,Object num, String tableName, String columnName, String column2){
            try {
                connectionToMYSQL();
                preparedStatement = myCon.prepareStatement("Insert into " + tableName + " ( " + columnName+","+column2+") values (?,?)");// ? means u dont know the value, if u have multiple column then u will use multiple ? mark, we have one column we r passing so we use one ? mark
                preparedStatement.setObject(2,data);// parameterIndex-->which column to insert the value, and data-->what information you want to insert
                preparedStatement.setObject(1,num);
                preparedStatement.executeUpdate();// We r updating our table so thats why we use "executeUpdate"


            }catch (IOException | ClassNotFoundException | SQLException ioException){

            }


    }
    /**
     * check if the table with the same name exists or not
     * if yes then drop the table
     * then create the new table with the same name
     * then insert data into the table
     */
    public static void insertDataFromArrayToSqlTable(int[] arrayData, String tableName, String columnName) {
        try {
            connectionToMYSQL();
            preparedStatement = myCon.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`");
            preparedStatement.executeUpdate();

            preparedStatement = myCon.prepareStatement("CREATE TABLE `" + tableName + "`(`ID` int (11) not null AUTO_INCREMENT,`" + columnName + "` bigint(20) DEFAULT NULL, PRIMARY KEY (`ID`));");
            preparedStatement.executeUpdate();

            for (int i = 0; i < arrayData.length; i++) {
                // Insert into tableName (columnName) values();
                preparedStatement = myCon.prepareStatement("INSERT  INTO " + tableName + " (" + columnName + ") values (?)");
                preparedStatement.setInt(1, arrayData[i]);//column name at index 1, data is what i want to add at each indexes
                preparedStatement.executeUpdate();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }










}//end
