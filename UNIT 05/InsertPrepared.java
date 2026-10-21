
import java.sql.*;

class InsertPrepared
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
            String sql = "INSERT INTO student VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            // Set Values
            ps.setInt(1, 3);
            ps.setString(2, "Amit");
            ps.setInt(3, 88);

            // Execute Query
            int result = ps.executeUpdate();

            if(result > 0)
            {
                System.out.println("Record inserted successfully.");
            }

            // Close Connection
            ps.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
