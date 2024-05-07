# SCANNER CLASS

Java'da Scanner sınıfı kullanıcıdan veya başka bir veri kaynağından giriş almak için kullanılır.
Bu sınıf java.util paketinde yer alır, bu yüzden Scanner sınıfını kullanmadan önce bu paketi import etmeniz gerekmektedir:
````java
import java.util.Scanner;
````

Scanner Sınıfı Oluşturma:

Scanner sınıfından bir obje oluşturmak için genellikle aşağıdaki ifade kullanılır.
Bu ifade ile kullanıcıdan giriş almayı sağlar:

````java
Scanner myScanner = new Scanner(System.in);
````

Burada, System.in bir InputStream'dir ve bu, genellikle klavyeden kullanıcı girişini temsil eder.

Scanner Metodları:

Scanner sınıfı, çeşitli veri türlerini okumak için bir dizi yöntem sağlar. Bazı önemli yöntemler şunlardır:

1. nextLine(): Kullanıcıdan bir satır okur (bir sonraki yeni satır karakterine kadar).

2. nextInt(): Kullanıcıdan bir tam sayı (int) okur.

3. nextDouble(): Kullanıcıdan bir çift (double) okur.

4. nextFloat(): Kullanıcıdan bir kayan nokta sayısı (float) okur.

5. next(): Kullanıcıdan bir kelime okur.

Bu metodlar kullanılarak kullanıcıdan çeşitli veri türlerinde girişler alabilirsiniz.

Aşağıdaki örnekte, kullanıcıdan bir tam sayı ve bir satır alıyoruz:
````java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int myInt = myScanner.nextInt();
        System.out.println("Girdiğiniz sayı: " + myInt);
        System.out.println("Bir cümle giriniz:");
        myScanner.nextLine(); // nextInt() sonrasında kalan newline karakterini yok etmek için.        
        String myString = myScanner.nextLine();
        System.out.println("Girdiğiniz cümle: " + myString);
        myScanner.close(); // Scanner'ı kapatmayı unutmayın!    
    }
}
````
Bu örnekte, nextInt() metodunu kullanarak kullanıcıdan bir tam sayı alıyoruz.
Ardından, nextLine() metodu ile kullanıcıdan bir satır alıyoruz.
Ancak, nextInt() metodunu kullandıktan sonra doğrudan nextLine() metodunu kullanırsanız, nextInt() metodunun sonunda kalan
newline karakterini okuyacağından, nextLine() metodunu iki kere kullanmamız gerekmektedir.

Son olarak, Scanner objesini close() metodu ile kapatmayı unutmayın.
Bu, kaynakları serbest bırakır ve olası hafıza sızıntılarını önler.