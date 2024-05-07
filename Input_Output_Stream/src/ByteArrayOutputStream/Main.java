/**
 * @author Nida Başer
 * March 2024
 */
package ByteArrayOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String data = "Java 102 Dersleri";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}