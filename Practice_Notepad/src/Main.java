/**
 * @author Nida Başer
 * March 2024
 */
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // VERİLERİN OKUNMASI
        try {
            FileReader fileReader = new FileReader("notes.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String textRead;
            while ((textRead = bufferedReader.readLine()) != null){
                System.out.println(textRead);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // VERİLERİN YAZILMASI
        Scanner s = new Scanner(System.in);
        System.out.print("Enter text: ");
        String textWrite = s.nextLine();
        try {
            FileWriter file = new FileWriter("notes.txt",true);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println();
            printWriter.print(textWrite);
            printWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}