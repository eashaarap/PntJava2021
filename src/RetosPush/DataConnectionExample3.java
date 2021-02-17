package RetosPush;

import java.sql.*;

public class DataConnectionExample3 {
    static String url ="jdbc:mysql://localhost:3306/wea_selenium_ny_fall2021";
    static String userName="root";
    static String password= "";

    public static void main(String[] args) {
        try {
            Connection mycon = DriverManager.getConnection(url,userName,password);
            Statement myStatement = mycon.createStatement();
            ResultSet results = myStatement.executeQuery("Select * From tutoring_squad");
            while(results.next()){
                System.out.println(results.getString("frndId")+" , "+results.getString("frnd_FirstName")
                        +" , "+results.getString("frnd_LastName")+" , "+results.getString("frnd_Salary"));
           }

//            String sql1 = "INSERT INTO `tutoring_squad`"
//                    +"(`frndID`, `frnd_FirstName`, `frnd_LastName`, `frnd_Salary`, `frnd_Email`)"
//            +"VALUES ('104', 'Nafiz', 'Islam', '248000', 'blah4@gmail.com')";
//
//            myStatement.execute(sql1);//this is will execute the sql code that will get the database
//            System.out.println("insert complete.");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
