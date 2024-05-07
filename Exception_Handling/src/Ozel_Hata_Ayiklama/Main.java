/**
 * @author Nida Başer
 * March 2024
 */
package Ozel_Hata_Ayiklama;

import java.util.Scanner;

public class Main {

    public static void checkAge(int age) throws AgeCheckException { // THROWS DEDİĞİMİZ İÇİN
        if (age < 18) {
            throw new AgeCheckException("Yaş hatası alındı"); // KENDİ YAZDIĞIMIZ HATA FIRLATMA SINIFINI DAHİL EDEBİLDİK.
        }
        System.out.println("Yasaktan Muaf !");
    }

    public static void main(String[] args) { // throws AgeCheckException
        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşınız : ");
        int a = scan.nextInt();

        // THROWS KULLANMAZSAK BU OLMAZ
        // checkAge(a);

        // THROWS KULLANINCA TRY-CATCH KALDIRILABİLİR
        try {
            checkAge(a);
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        System.out.println("Program is over");
    }
}