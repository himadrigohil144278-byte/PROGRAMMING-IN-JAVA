
import java.sql.*;

class DisplayData
{
    public static void main(String args[])
    {
        try
        {
            // Load Oracle Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system",
                "password"
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // Display Data from Table
            String sql = "SELECT * FROM student";

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next())
            {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Marks: " + rs.getInt("marks"));
                System.out.println("--------------------");
            }

            // Close Connection
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
