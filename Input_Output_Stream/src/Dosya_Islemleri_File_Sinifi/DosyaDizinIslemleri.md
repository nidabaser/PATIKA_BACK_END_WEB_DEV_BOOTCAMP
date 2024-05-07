Java'da dosya ve dizin işlemleri, genellikle java.io.File,  java.nio.file.Path, java.nio.file.Paths ve java.nio.file.Files sınıfları aracılığıyla yapılır.

Dosya ve Dizinlerle İşlem Yapma
````java
import java.io.File;

public class Main {
    public static void main(String[] args) {
// Dosya oluşturma        
        File myFile = new File("myFile.txt");
// Dosyanın var olup olmadığını kontrol etme        
        if (myFile.exists()) {
            System.out.println("Dosya mevcut.");
        } else {
            System.out.println("Dosya mevcut değil.");
        }
// Dizin oluşturma        
        File myDir = new File("myDirectory");
        if (!myDir.exists()) {
            if (myDir.mkdir()) {
                System.out.println("Dizin oluşturuldu.");
            } else {
                System.out.println("Dizin oluşturulamadı.");
            }
        }
        // Bir dizindeki dosya ve dizinleri listeleme        
        File dir = new File(".");
        File[] filesList = dir.listFiles();
        for (File file : filesList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            } else if (file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
    }
}
````
Dosya Okuma ve Yazma
````java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
// Dosyaya yazma        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"))) {
            bw.write("Merhaba Dünya!");
        } catch (IOException e) {
            e.printStackTrace();
        }

// Dosyadan okuma        
        try (BufferedReader br = new BufferedReader(new FileReader("myFile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
````
java.nio.file API ile Dosya ve Dizin İşlemleri

Java 7'de tanıtılan java.nio.file API, dosya ve dizin işlemlerini gerçekleştirmek için daha modern bir yol sağlar.
````java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
// Dosya ve dizin oluşturma        
        Path myFile = Paths.get("myFile.txt");
        Path myDir = Paths.get("myDirectory");

        try {
            Files.createFile(myFile);
            Files.createDirectories(myDir);
        } catch (IOException e) {
            e.printStackTrace();
        }

// Dosyanın var olup olmadığını kontrol etme        
        boolean exists = Files.exists(myFile);
        System.out.println("Dosya mevcut: " + exists);
// Dosyayı başka bir konuma taşıma        
        Path targetPath = Paths.get("myDirectory/myFile.txt");
        try {
            Files.move(myFile, targetPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
````
Her bir örneğin ayrıntılı açıklaması kodların içerisinde mevcuttur.
Bu örnekler temel dosya ve dizin işlemlerinin nasıl yapıldığını gösterir.
Ancak, gerçek dünya uygulamaları daha karmaşık senaryoları içerebilir ve
java.io veya java.nio.file API'lerinin daha gelişmiş özelliklerini gerektirebilir.