/**
 * @author Nida Başer
 * March 2024
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("NESTED CLASS AND GENERIC STRUCTURES");
        System.out.println();
        /*
        NESTED CLASS (iç içe saınıflar)
        - inner class (iç sınıflar)
            - static --> is more used
            - non-static
        - Local Class (Yerel Sınıflar)
        - Anonymous Class (Anonim Sınıflar)
         */

        //OuterClass out = new OuterClass();
        //out.run();

        // NOT WORKS
        //OuterClass.InnerClass in = new OuterClass.InnerClass();

        // WORKS (in non static)
        //OuterClass.InnerClass in = out.new InnerClass();
        // Önce <dıştaki sınıf> sonra <içteki sınıf> sonra <nesne adı> = <dış sınıf>.new <iç sınıf>();
        //in.run();

        // LOCAL CLASS
        //LocalClass local = new LocalClass();
        //local.run();

        // Anonymous Class
        //Anonymous a = new Anonymous();
        //a.run();

        Anonymous a = new Anonymous(){ // SADECE O NESNEYE AİT BİR SINIF

            // Define variable in here
           public int a = 10;

            @Override
            public void run(){
                System.out.println(this.a);
                System.out.println("Anonim olarak yazılmış run metodu");
                // If write method here it will work
                print();
            }

            public void print(){
                System.out.println("Print metodu");
            }
        };

        // WORKS
        a.run();

        // NOT WORKS nesne üzerinden ulaşılamaz
        //a.print();


    }
}