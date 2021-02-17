package RetosPush;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatingInfoInTable {
     static String url = "jdbc:mysql://localhost:3306/wea_selenium_ny_fall2021";
     static String user = "root";
     static String password = "Monika199%";

    public static void main(String[] args) {

    }


    public static void connection(String url,String user, String password) throws SQLException {

        try {
            //1. get a connection to databse

            Connection myConnection = DriverManager.getConnection(url,user,password);
            System.out.println("Database is connected.....");

            //2. Create a statement

            Statement mySt = myConnection.createStatement();

            //Execute SQL query

            String sql = "update employees2demo"
                    +" set email = 'blahblah@gmail.com"
                    + " where id = 6";

            mySt.execute(sql);//this is will execute the sql code that will get the database
            System.out.println("update complete.");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}