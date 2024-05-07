/**
 * @author Nida Başer
 * April 2024
 */
import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/jdbc";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement st = conn.createStatement();

            ResultSet resultSet = st.executeQuery("SELECT * FROM employees");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                int salary = resultSet.getInt("salary");

                // Okunan verileri ekrana yazdırma
                System.out.println("ID : " + id);
                System.out.println("Adı : " + name);
                System.out.println("Pozisyon : " + position);
                System.out.println("Maaş : " + salary);
                System.out.println("---------------------------");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}