package RetosPush;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingIntotheTableCreated {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/wea_selenium_ny_fall2021";
        String user = "root";
        String password = "Use your own password here ";

        try {
            //1. get a connection to databse

            Connection myConnection = DriverManager.getConnection(url,user,password);
            System.out.println("Database is connected.....");

            //2. Create a statement

            Statement mySt = myConnection.createStatement();

            //Execute SQL query

            String sql = "insert into employees2demo"
                    +" (id, last_name, first_name, email)"
                    + " values ('6','Brown','David', 'david.brown@shooo.com')";

            mySt.execute(sql);//this is will execute the sql code that will get the database
            System.out.println("insert complete.");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
