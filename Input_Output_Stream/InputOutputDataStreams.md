# I/O Veri Akışları

Bu bölümde Java'da Input / Output akışları (Stream) konusunu öğreneceğiz.
Java’da veri giriş/çıkış işlemlerini, bir yerden başka bir yere
(byte dizileri halinde) akan veriler olarak düşünebiliriz.

Veri okumak için bir giriş akışı (Input Stream) ve
veri yazmak için bir çıktı akışı (Output Stream) kullanılır.
````java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
````
Örneğin, ilk "Hello World!" örneğimizde, ekrana çıktı vermek için System.out'u kullandık.
Burada, System.out bir tür çıktı akışıdır(Output Stream).

Java’da veri akımlarının iki ana gruba ayrıldığını söylemeliyiz:
- Byte akımları (Byte Streams)
- Karakter akımları (Character Streams)

### Byte Akışları (Byte Stream)
Byte akışı, tek baytlık (8 bit) veriyi okumak ve yazmak için kullanılır.
Resim, grafik, ses ve benzeri karakter tipinden olmayan bütün akımlar
byte akımlarıdır.

Tüm byte akışı sınıfları, InputStream ve OutputStream
soyut (abstract) sınıflardan türetilir.

### Karakter Akışları (Character Stream)
Karakter akışı, tek bir veri karakterini okumak ve yazmak için kullanılır.
Karakter akımları, adından da anlaşılacağı üzere, karakter tipinden verilerin
giriş/çıkışını yapar. Unicode kullandığı için, farklı ülkelerin alfabelerine uyum sağlar.

Tüm karakter akışı sınıfları, Reader ve Writer soyut (abstract) sınıflarından türetilir.

-----------------------------------------------------------------------------------

# File Sınıfı
Java.io paketinin File sınıfı, dosyalar ve dizinler üzerinde çeşitli işlemler gerçekleştirmek için kullanılır.

Dosyalarla çalışmak için kullanılabilecek java.nio adında başka bir paket var.
Ancak bu eğitimde java.io paketine odaklanacağız.

### Dosya ve Dizinler
Dosya, ilgili bilgileri depolamak için kullanılabilen adlandırılmış bir konumdur.

- Örneğin : main.java, Java programı hakkında bilgiler içeren bir Java dosyasıdır.

Dizinler, dosya ve alt dizinlerden oluşan bir koleksiyondur.
Bir dizinin içindeki bir dizin, alt dizin olarak bilinir.

Bir File nesnesi oluşturmak için, önce java.io.File paketini içe aktarmamız gerekir.
````java
File file = new File(String pathName);
````
![fileMethods.png](src%2Fimg%2FfileMethods.png)

### Dosya Oluşturma
Yeni bir dosya oluşturmak için createNewFile() metodunu kullanabiliriz.
Eğer yeni bir dosya oluşturulursa metot true,
dosya zaten belirtilen konumda mevcutsa false değerini döndürür.
````java
import java.io.File;

public class PatikaDev {
    public static void main(String[] args) {

        File file = new File("patika.txt");

        try {
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("Yeni Dosya Oluştu.");
            } else {
                System.out.println("Dosya Zaten Mevcut.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
````
### Dosya Silme

Belirtilen dosyayı veya dizini silmek için File sınıfının delete() metodunu kullanabiliriz.
Not: Sadece boş dizinleri silebiliriz.
````java
import java.io.File;

public class PatikaDev {
    public static void main(String[] args) {

        File file = new File("patika.txt");

        boolean value = file.delete();
        if (value) {
            System.out.println("The File is deleted.");
        } else {
            System.out.println("The File is not deleted.");
        }

    }
}
````
### Dizin Oluşturma
Java File sınıfı, yeni bir dizin oluşturmak için mkdir() metodunu sağlar.
Metot geriye;
- yeni dizin oluşturulursa true,
- dizin zaten mevcutsa false döndürür.
````java
import java.io.File;

public class PatikaDev {
    public static void main(String[] args) {

        File file = new File("patika/test");

        boolean value = file.mkdir();
        if (value) {
            System.out.println("The new directory is created.");
        } else {
            System.out.println("The directory already exists.");
        }

    }
}
````
### Dizindeki Elemanları Listeleme
````java
import java.io.File;

public class PatikaDev {
    public static void main(String[] args) {

        File file = new File("test");

        String[] fileList = file.list();

        for (String str : fileList) {
            System.out.println(str);
        }

    }
}
````

## InputStream Sınıfı

InputStream sınıfı byte akışını temsil eden bir abstract sınıftır ve
Java.io paketinden gelmektedir.

InputStream abstract bir sınıf olduğu için kendi başına kullanışlı değildir
o yüzden InputStream'a ait alt sınıflar veri okumak için kullanılır.

InputStream alt sınıfları :
- FileInputStream,
- ByteArrayInputStream,
- ObjectInputStream

## FileInputStream

Java.io paketinin FileInputStream sınıfı, dosyalardan verileri (bayt cinsinden) okumak için kullanılır.

InputStream soyut (Abstract) sınıfını miras alır.

### FileInputStream Oluşturma

Bir dosya giriş akışı oluşturmak için önce java.io.FileInputStream paketini içe aktarmalıyız. Paketi içe aktardıktan sonra, Java'da bir dosya giriş akışını nasıl oluşturabileceğimizi burada bulabilirsiniz.

#### Dosya Yolu Kullanma
````java
FileInputStream input = new FileInputStream(stringPath);
````
#### Nesne Kullanma
````java
FileInputStream input = new FileInputStream(File fileObject);
````
#### FileInputStream Metotları
FileInputStream sınıfına ait metotlar :
- read() : Dosyadan tek baytlık veri okur.
- read(byte[] array) : dosyadan verileri bayt cinsinde okur ve belirtilen dizide depolar
````java
import java.io.FileInputStream;

public class PatikaDev {
public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("input.txt");

            System.out.println("Dosyadaki veriler: ");

            // İlk baytı okur
            int i = input.read();

            while (i != -1) {
                // Byte to char
                System.out.print((char) i);
                // Dosyadan sonraki baytı okur
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
````
- available();

````java
package stream;

import java.io.FileInputStream;

public class PatikaDev {
public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("input.txt");

            // Kullanılabilir bayt sayısını verir
            System.out.println("Kullanılabilir bayt sayısı : " + input.available());

            // Dosyadan 3 baytlık veri okur
            input.read();
            input.read();
            input.read();

            // Kullanılabilir bayt sayısını verir
            System.out.println("Kullanılabilir bayt sayısı : " + input.available());

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
````
- skip();

Belirtilen bayt sayısını atmak ve atlamak için skip () yöntemini kullanabiliriz. Örneğin,
````java
import java.io.FileInputStream;

public class PatikaDev {
public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("input.txt");

            // 5 byte atlanacaktır
            input.skip(5);
            System.out.println("5 bytelık veri atlandı : ");

            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
````

## FileOutputStream
Java.io paketinin FileOutputStream sınıfı, dosyalara veri (bayt cinsinden) yazmak için kullanılabilir.

OutputStream abstract sınıfını genişletir.

### FileOutputStream oluşturma
Bir dosya çıktı akışı oluşturmak için önce java.io.FileOutputStream paketini içe aktarmalıyız.

#### Dosya Yolu Kullanmak
````java
// 1. Including the boolean parameter
FileOutputStream output = new FileOutputStream(String path, boolean value);

// 2. Not including the boolean parameter
FileOutputStream output = new FileOutputStream(String path);
````
İsteğe bağlı bir boolean parametresi gönderilir.
Bu parametre True olarak ayarlanırsa, yeni veriler dosyadaki mevcut verilerin sonuna eklenecektir.
Aksi takdirde, yeni veriler dosyadaki mevcut verilerin üzerine yazar.

#### File Nesnesi Kullanmak
````java
FileOutputStream output = new FileOutputStream(File fileObject);
````
Örnek:
````java
import java.io.FileOutputStream;

public class PatikaDev {
    public static void main(String[] args) {
        String data = "Patika ile Java Öğreniyorum !!";
        try {
            FileOutputStream output = new FileOutputStream("output.txt");
            byte[] array = data.getBytes();
            output.write(array);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
````

*INPUT STREAM: Programımıza dışarıdan veri aldığımızda*

*OUTPUT STREAM: Programımızdan dışarı veri vermek istediğimizde*
