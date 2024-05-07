/**
 * @author Nida Başer
 * March 2024
 */
import java.sql.*;

public class DBConnect {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {

        // VERİTABANINA BAĞLANMA

//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//        } catch (SQLException e) {
//            System.out.println("SQLException: " + e.getMessage());
//            System.out.println("SQLState: " + e.getSQLState());
//            System.out.println("VendorError: " + e.getErrorCode());
//            System.out.println(e.getMessage());
//        }



        // VERİTABANINDAN KAYITLARI SORGULAMA
        Connection conn = null;
        Statement st = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            st = conn.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM student"); // SQL QUERY BURADA !

            System.out.println("UNIVERSITY DATABASE");
            System.out.println("----------------------");

            while (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt("student_id"));
                System.out.println("Adı : " + resultSet.getString("student_name"));
                //System.out.println("Soyadı : " + resultSet.getString("student_lname"));
                System.out.println("Sınıfı : " + resultSet.getInt("student_class"));
                System.out.println("----------------------");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }



        // VERİTABANINDAN KAYITLARI SORGULAMADA BAZI EKSTRA METODLAR
//        Connection conn = null;
//        Statement st = null;
//        try {
//            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            ResultSet resultSet = st.executeQuery("SELECT * FROM student"); // SQL QUERY BURADA !
//
//            System.out.println("UNIVERSITY DATABASE");
//            System.out.println("----------------------");
//
//            resultSet.next();
//            resultSet.next();
//            resultSet.first(); // TYPE_FORWARD_ONLY hatası verir.
//            // Bunu düzeltmek için yukarıda createStatment(); içine eklenir
//            // (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
//            resultSet.last(); // Bu da sonuncuyu yazar
//            resultSet.absolute(2); // 2.satırı verecek
//
//        } catch (SQLException ex) {
//            System.out.println("SQLException: " + ex.getMessage());
//            System.out.println("SQLState: " + ex.getSQLState());
//            System.out.println("VendorError: " + ex.getErrorCode());
//        }





        // VERİTABANI TABLOSUNA KAYIT EKLEME
//        Connection conn = null;
//        Statement st = null;
//        try {
//            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//            st = conn.createStatement();
//
//            // YÖNTEM 1: Statement ile Insert İşlemi
////            String insertSql = "INSERT INTO student (student_name, student_class) VALUES ('Barış', '1')";
////            System.out.println(st.executeUpdate(insertSql));
//
//            // YÖNTEM 2: PreparedStatement ile Insert İşlemi
//            String prSql = "INSERT INTO student (student_name, student_class) VALUES (?,?)";
//            PreparedStatement pr = conn.prepareStatement(prSql);
//            pr.setString(1, "Harry Potter");
//            pr.setString(2, "5");
//            pr.executeUpdate();
//            st.close();
//
//        } catch (SQLException e) {
//            System.out.println("SQLException: " + e.getMessage());
//        }





        // VERİTABANI KAYIT GÜNCELLEME
//        Connection connect = null;
//        String stSql = "UPDATE student SET student_name = 'Barış Manço' WHERE student_id = 3"; // SQL QUERY
//        String prSql = "UPDATE student SET student_name = ? WHERE student_id = ?"; // PREPARED SQL QUERY
//        try {
//            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//
//            //Statement st = connect.createStatement();
//            //st.executeUpdate(stSql);
//
//            PreparedStatement pr = connect.prepareStatement(prSql);
//            pr.setInt(2,4); // Tabloda 4.indeksteki satıra gel
//            pr.setString(1,"Patika Dev"); // Onun birinci indeksteki adını güncelle
//            pr.executeUpdate();
//
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }





        // VERİTABANINDAN KAYIT SİLMEK
//        Connection connect = null;
//        String stSql = "DELETE FROM student WHERE student_id = 4"; // SQL QUERY
//        String prSql = "DELETE FROM student WHERE student_id = ?"; // PREPARED SQL QUERY
//        try {
//            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//
//            Statement st = connect.createStatement();
//            st.executeUpdate(stSql);
//
////            PreparedStatement pr = connect.prepareStatement(prSql);
////            pr.setInt(1,3);
////            pr.executeUpdate();
//
//            // EN SON KAPATALIM
//            st.close();
//            connect.close();
//            //pr.close();
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }









    }
}