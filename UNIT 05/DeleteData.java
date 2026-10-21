
import java.sql.*;

class DeleteData
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

            // Delete Data from Table
            String sql = "DELETE FROM student WHERE id = 1";

            int result = stmt.executeUpdate(sql);

            if(result > 0)
            {
                System.out.println("Data deleted successfully.");
            }
            else
            {
                System.out.println("Record not found.");
            }

            // Close Connection
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
