/**
 * @author Nida Başer
 * March 2024
 */
package TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Program başladı");
        Scanner s = new Scanner(System.in);

        //Main metodunu değil
        //içindeki işlemleri try-catch'e alabiliriz.

        int a = 1; // a=0 olsa aritmetik exception
        int b = 20;
        int c;
        int[] arr = new int[2];

        try{
            System.out.println("Bölme işlemi başladı: ");
            System.out.println(b/a);
            System.out.println("Bölme işlemi bitti..\nSayı gir: ");
            c=s.nextInt();
            arr[10] = 11;
        } catch (ArithmeticException e){
            System.out.println("Hata yakalandı !");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        } catch (InputMismatchException e){
            System.out.println("Yanlış veri girildi");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dizi boyutu aşıldı");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // BUTUN EXCEPTION'LARIN ATA SINIFI
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bu kısım kesinlikle çalışacaktır.");
        }
        System.out.println("Program bitti !");
    }
}