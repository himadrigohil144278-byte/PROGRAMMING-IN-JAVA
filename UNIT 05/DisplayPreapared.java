
import java.sql.*;

class DisplayPrepared
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

            // Create PreparedStatement
            String sql = "SELECT * FROM student";

            PreparedStatement ps = con.prepareStatement(sql);

            // Execute Query
            ResultSet rs = ps.executeQuery();

            // Display Records
            while(rs.next())
            {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Marks: " + rs.getInt("marks"));
                System.out.println("--------------------");
            }

            // Close Connection
            rs.close();
            ps.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
