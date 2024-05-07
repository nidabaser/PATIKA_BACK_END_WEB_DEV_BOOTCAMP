/**
 * @author Nida Başer
 * March 2024
 */
public class Main {
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }

    public static void main(String[] args){
// İlk Gösterim
        Hayvan hayvan = new Hayvan("Hiper");
        System.out.println(hayvan.konus());
        Hayvan hayvan1 = new Kedi("Hiper");
        System.out.println(hayvan1.konus());
        Hayvan hayvan2 = new Kopek("Hiper");
        System.out.println(hayvan2.konus());
        Hayvan hayvan3 = new At("Hiper");
        System.out.println(hayvan3.konus());

//Fonksiyon kullanarak gösterim
        konustur(new Kedi("Nasip"));
        konustur(new Kopek("Karabaş"));
        konustur(new At("Bold-Pilot"));
    }
}