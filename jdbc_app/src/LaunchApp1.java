//Step 1: Import the required packages
import java.sql.*;

public class LaunchApp1 {
    public static void main(String[] args) throws SQLException {
        //Load and register the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Establish the connection
        String url="jdbc:mysql://localhost:3306/jdbc_app";
        String user="root";
        String password="password";
        Connection con;
        try {
            con = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            // handle exception
            con=null;
            e.printStackTrace();
        }

        //Create a statement
        Statement stmt;
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            // Auto-generated catch block
            e.printStackTrace();
                stmt=null;
        }

        //Execute the query
        //Non-select query Insertion, Deletion, Update
        String sql1="insert into Demo values(103,'Sneha',18,'Nanded')";
        int res;
        try {
            res = stmt.executeUpdate(sql1);
        } catch (SQLException e) {
            // Auto-generated catch block
            e.printStackTrace();
            res=0;
        }

        //Retrieval of data Select query
        String sql2="select * from Demo";
        ResultSet rs;
        try {            rs = stmt.executeQuery(sql2);
        } catch (SQLException e) {
            // Auto-generated catch block
            e.printStackTrace();
            rs=null;
        }


        //Process the result
        if(res>0){
            System.out.println("Record inserted successfully");
        }
        else{
            System.out.println("Record insertion failed");
        }

        if(rs!=null){
            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                int age=rs.getInt(3);
                String city=rs.getString(4);
                System.out.println(id+" "+name+" "+age+" "+city);
            }
        }

        //Close the connection
        try {
            if(stmt!=null){
                stmt.close();
            }
            if(con!=null){
                con.close();
            }
        } catch (Exception e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
    }
}
