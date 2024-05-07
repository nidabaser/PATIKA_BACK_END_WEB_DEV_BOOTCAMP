/**
 * @author Nida Başer
 * March 2024
 */
package ByteArrayInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) { // Try catch yerine buraya da eklenebilir "throws IOException"
        byte[] dizi = {1,2,3,54,66};
        ByteArrayInputStream input = new ByteArrayInputStream(dizi); // (dizi, offset: 2, length:4) başlangıç bitişlerini belirtilebilir.
//        System.out.println(input.read());
//        System.out.println(input.read());
//        System.out.println(input.read());
        //input.skip(3); // Eleman atlama
        System.out.println("Kullanılabilen byte sayısı: " + input.available());
        int i = input.read();
        while (i != -1) {
            System.out.println(i);
            i = input.read();
        }
        try {
            input.close(); //Kapatma fayda var
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}