/**
 * @author Nida Başer
 * April 2024
 */

package core;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    public static Connection connection(){ // Neden statik çok yerde kullanılacak, sürekli nesne üretilmesin diye
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/example", "postgres", "postgres");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
