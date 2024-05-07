/**
 * @author Nida Başer
 * March 2024
 */
package Throw_Kullanımı;
import java.util.Scanner;
public class Main {

                                        // throws dan sonra virgülle birden fazla exception da verebiliriz
    public static void checkAge(int age) throws Exception, IndexOutOfBoundsException { // THROWS KEYWORD: Runtime exception dışındakiler için
        if (age<18){
            throw new IndexOutOfBoundsException("Your age is younger"); // ÖZEL YAPILAR ATA SINIFIN ALT SINIFLARI
            //throw new Exception("Your age is younger"); // GENEL YAPISI ATA SINIF
        }
        System.out.println("Age ok");
    }

    public static void main(String[] args) { // THROWS KEYWORD gerek yok try-catch varken
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        // BURADA TRY-CATCH KULLANMAZSAK PROGRAM DURUR
        // HATAYI GÖSTERSİN AMA SONUNA KADAR ÇALIŞSIN DİYE
        try{
            checkAge(age);
        } catch (Exception e){
            System.out.println("Age is under 18");
            System.out.println(e.toString());
        }
        System.out.println("Program ended");
    }



}
