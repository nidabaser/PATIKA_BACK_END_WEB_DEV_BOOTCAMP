/**
 * @author Nida Başer
 * March 2024
 */
public class Main {
    public static void main(String[] args) {

        int a = 10;

        // Autoboxing
        Integer b = a;

        // Boxing
        Integer c = Integer.valueOf(a);
        // Bunun otomatik yapıldığını ve gereksiz olduğunu söylüyor

        // Auto Unboxing
        int d = c; // Bu zaten c.intValue(); işlemi yapmış oluyor otomatik
        System.out.println(d);
        /*
         Burada d nesne gibi davranamıyor ama eşitlendiği c bir nesne
         c.toString(); // diyebiliyoruz
         d.toString(); // diyemiyoruz
        */

        // Unboxing
        int i = c.intValue();
        // Bu da otomatik yapıldığı için gereksiz uyarısı verir.


    }
}