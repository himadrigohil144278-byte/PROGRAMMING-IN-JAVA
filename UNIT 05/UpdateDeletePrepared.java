
import java.sql.*;

class UpdateDeletePrepared
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

            // Update Record
            String sql1 = "UPDATE student SET marks = ? WHERE id = ?";

            PreparedStatement ps1 = con.prepareStatement(sql1);

            ps1.setInt(1, 95);
            ps1.setInt(2, 3);

            int result1 = ps1.executeUpdate();

            if(result1 > 0)
            {
                System.out.println("Record updated successfully.");
            }
            else
            {
                System.out.println("Record not found for update.");
            }

            ps1.close();

            // Delete Record
            String sql2 = "DELETE FROM student WHERE id = ?";

            PreparedStatement ps2 = con.prepareStatement(sql2);

            ps2.setInt(1, 3);

            int result2 = ps2.executeUpdate();

            if(result2 > 0)
            {
                System.out.println("Record deleted successfully.");
            }
            else
            {
                System.out.println("Record not found for deletion.");
            }

            // Close Connection
            ps2.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
