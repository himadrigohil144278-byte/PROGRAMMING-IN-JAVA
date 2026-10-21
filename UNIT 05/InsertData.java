
import java.sql.*;

class InsertData
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

            // Insert Data into Table
            String sql = "INSERT INTO student VALUES (1, 'Rahul', 85)";

            int result = stmt.executeUpdate(sql);

            if(result > 0)
            {
                System.out.println("Data inserted successfully.");
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
