/**
 * @author Nida Başer
 * March 2024
 */
package Pratik_Try_Catch;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Diziyi oluştur
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Kullanıcıdan indeks girdisi al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir indeks girin: ");
        int index = scanner.nextInt();

        // Metodu çağır ve sonucu yazdır
        try {
            int result = getElementAtIndex(array, index);
            System.out.println("Belirtilen indeksteki eleman: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Belirtilen indeks dizinin boyutunun dışında!");
        }
    }

    // Dizide belirtilen indeksteki elemanı döndüren metod
    public static int getElementAtIndex(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        // Belirtilen indeks dizi boyutunun dışında mı kontrol et
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        // Belirtilen indeksteki elemanı döndür
        return array[index];
    }
}

