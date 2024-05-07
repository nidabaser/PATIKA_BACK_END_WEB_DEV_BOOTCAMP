package Dosya_Islemleri_File_Sinifi;
/**
 * @author Nida Başer
 * March 2024
 */
import java.io.*;
public class Main {
    public static void main(String[] args) {
        // DOSYA OLUŞTURMA
        String str = "Dosyaya bir metin yaz";
        String str2 = "Dosyaya ikinci bir metin yaz";
        String path = "C:\\Users\\NIDA\\Desktop/dosya.txt";
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        //DOSYA YAZMA
//        try {
//            FileWriter fileWriter = new FileWriter(file, true); // append: true eklemezsek,
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.append(str); // append yerine write metodu kullanırsak
//            //String formatliYazi = String.format("%10s", ad); // Formatlı yazı da yazdırabiliriz
//            //bufferedWriter.write(formatliYazi);
//            bufferedWriter.newLine();
//            bufferedWriter.append(str2); // belgeyi sıfırdan yazar, ama append ile sonuna ekler
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // DOSYA OKUMA
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                String word1 = line.substring(0,8);
                String word2 = line.substring(8,12);
                System.out.println(word1 + "   " + word2);
                bufferedReader.close(); // işimiz bittiğinde kapatmazsak aşağıdaki silme komutu çalışmaz.
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //not: boşlukları almak için metod
        //words = word1.replaceAll(regex: " ", replacement: "");

        // Dosya varsa dosyayı sil
//        if (file.exists()){
//            file.delete();
//        }

    }
}
