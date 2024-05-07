PrintWriterClass


Java.io paketinin PrintWriterClass sınıfı, çıktı verilerini yaygın olarak okunabilir bir biçimde (metin) yazmak için kullanılabilir. Writer soyut sınıfını genişletir.



Diğer Writer sınıflarının aksine, PrintWriterClass ilkel verileri (int, float, char, vb.) Metin formatına dönüştürür. Daha sonra bu biçimlendirilmiş verileri Writer'a aktarır.



Ayrıca, PrintWriterClass sınıfı herhangi bir girdi / çıktı istisnası (Exception) atmaz. Bunun yerine, içindeki herhangi bir hatayı bulmak için checkError() metodu kullanmamız gerekir.



import java.io.PrintWriterClass;

public class PatikaDev {
public static void main(String[] args) {
String data = "Java 102 Dersleri.";
try {
PrintWriterClass output = new PrintWriterClass("output.txt");
output.print(data);
output.close();
} catch (Exception e) {
e.getStackTrace();
}
}
}