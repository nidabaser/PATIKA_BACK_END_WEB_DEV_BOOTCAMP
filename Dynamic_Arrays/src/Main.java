/**
 * @author Nida Başer
 * March 2024
 */
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dinamik Diziler (ArrayList)\n");

        ArrayList<String> liste = new ArrayList<>();

        liste.add("Merhaba");
        liste.add("Dünya");
        liste.add("Patika");
        liste.add("Java");
        liste.add("102");

        for(String s : liste) {
            System.out.println(s);
        }

        liste.remove("Merhaba");

        System.out.println(liste.size());

        System.out.println(liste.get(2));

        System.out.println(liste.getFirst());

        Collections.sort(liste);

        System.out.println(liste.contains("Merhaba"));

        System.out.println(liste.indexOf("Dünya"));

        liste.clear();

    }
}