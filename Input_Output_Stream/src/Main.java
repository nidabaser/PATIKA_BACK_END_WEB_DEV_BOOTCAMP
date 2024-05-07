/**
 * @author Nida Başer
 * March 2024
 */

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
//        File dosya = new File("patika.txt");
//        try {
//            if(dosya.createNewFile()){
//                System.out.println(dosya.getName() + " dosyası oluşturuldu");
//            } else {
//                System.out.println(dosya.getName() + " dosyası zaten mevcut !");
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //System.out.println(dosya.delete()); // Silindiyse True döner.

//        File dizin = new File("test");
//        dizin.mkdir();
//
//        File dosya = new File("test/patika.txt");
//        try {
//            System.out.println(dosya.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File dizin = new File("patika/dev"); // Böyle bir üst klasör yoksa onun alt klasörünü de oluşturması için
//        System.out.println(dizin.mkdirs()); // mkdirs şeklinde sonuna mkdirS s'yi eklersek oluşur

//        File dizin = new File("src");
//        String[] liste = dizin.list();
//
//        for (String str : liste) {
//            System.out.println(str);
//        }

        //try {

            // Birinci yöntem (java.io.File import edilmeli)
            // Dosya mevcut değilse
//            File dosya = new File("patika.txt");
//            FileInputStream input = new FileInputStream(dosya);

            // İkinci yöntem: Dosya zaten mevcutsa
            //FileInputStream input = new FileInputStream("patika.txt");
//            System.out.println(input.read()); // Dosyanın içi boşsa -1 döndürür.
//            System.out.println(input.read()); // Doluysa ilik harfin ASCII sayısını döndürür
            //int i = input.read();
            //while (i != -1) {
            //    System.out.print((char)i);
            //    i = input.read(); // input.read() ile ilk byte okuyup sonrakine geçer, sonrakine geçer...
            //}
            //input.close(); // İşimizin bittiği yerde kapatalım, hafızada yer kaplar.

//            FileInputStream input = new FileInputStream("patika.txt");
//            System.out.println("Kullanılabilir byte sayısı: " + input.available()); // İçinde kaç tane karakter var?
//            input.read();
//            input.read();
//            input.read();
//            input.read();
//            System.out.println("Kullanılabilir byte sayısı: " + input.available()); // Dört karakter okunduktan sonra kaç tane kaldıysa onu döndürür
//            input.close();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        // NOTE: input.skip(10); metodu mesela ilk 10 karakteri atlıyor devamını yazdırıyor

        String yazi = "\nI'm learning OutputStream\nPatika.dev";
        // Bu veriyi bir dosyaya yazıdrmak için verinin byte türünde olması lazım

           try {
               File dosya = new File("patika.txt");
               FileOutputStream output = new FileOutputStream("patika.txt", true);
               // Eğer en son append:true eklemezsek sıfırdan içi boş dosyayı üzerine bir daha yazar.
               byte[] yaziByte = yazi.getBytes();
               output.write(yaziByte); // Write metoduyla byte atabiliriz içine String atamayız Byte'çevirmeliyiz.
               output.close(); // Akışları bitirmeliyiz programın sağlığı açısından
           } catch (Exception e) {
               System.out.println(e.getMessage());
           }


    }
}