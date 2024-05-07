/**
 * @author Nida Başer
 * March 2024
 */

package BufferedInputOutputStream;

//import java.io.BufferedInputStream;
//import java.io.FileInputStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args){
        // INPUT ILE OKUYALIM
//        try {
//            FileInputStream fileInputStream = new FileInputStream("patika.txt");
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//
//            int i = bufferedInputStream.read();
//            while (i != -1) {
//                System.out.print((char)i);
//                i = bufferedInputStream.read();
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        // OUTPUT İLE YAZDIRALIM
        String data = "I'm learning Java 102";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("patika.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] arr = data.getBytes();
            bufferedOutputStream.write(arr);

            fileOutputStream.close();
            bufferedOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
