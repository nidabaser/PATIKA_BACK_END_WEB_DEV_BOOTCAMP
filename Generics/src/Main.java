/**
 * @author Nida Başer
 * March 2024
 */
public class Main {
    public static void main(String[] args) {

        // Undefined
        String s;

        // null (değeri yok)
        String s1 = null;

        // empty (değerinin içi boş)
        String s2 = " ";

        // NullableString class'ını çalıştıralım
//        String str = "BirString"; // = null; = " "; denendi
//        String str1; // Undefined tanımlarsak ve nesne üretmeye kalkarsak hata verir
//        NullableString n = new NullableString(str);
//        n.print();

        // NullableInteger class'ını çalıştıralım
//        Integer num = 123; // = 0;
//        NullableInteger nu = new NullableInteger(num);
//        nu.run();

        // Nullable generic class'ı çalıştıralım
        // Wrapper ile çalışılar yani;
        // int değil, Integer ile
//        Nullable<Integer> t1 = new Nullable<>(10);
//        Nullable<String> t2 = new Nullable<>("Hello");
//        Nullable<Double> t3 = new Nullable<>(3.14);
////        System.out.println("Integer: " + t1);
////        System.out.println("String: " + t2);
////        System.out.println("Double: " + t3);
//        t1.run();
//        t2.run();
//        t3.run();

        Integer a = 10;
        String b = "patika";
        Double d = 3.14;
        String c = "dev";

        GenericTest<Integer, String, Double> t = new GenericTest<>(a,b,d);
//        t.showInfo();
//        t.setObj2(c);
//        t.showInfo();

        // NOT: char veri tipinin wrapper sınıfı Character'dir.
        String[] dizi = {"Java","102","Patika","Dev"};
        Integer[] sayilar = {1,2,3,4};
        Character[] harfler = {'J','A','V','A'};

        // ÜÇ AYRI FOR DONGUSUNE GEREK YOK
//        for (String eleman:dizi){
//            System.out.println(eleman);
//        }
//
//        for (Integer eleman:sayilar){
//            System.out.println(eleman);
//        }
//
//        for (Character eleman:harfler){
//            System.out.println(eleman);
//        }

        // GENERIC METODLA HALLETTIK (CLASS DEĞİL METOD)
        //PrintArrays.printArray(dizi, sayilar);

        // TEKLİ PARAMETRE DE OLUR
        //PrintArrays.printArray(sayilar);


        // GENERIC INTERFACE
//        Student<String> stu = new Student<String>();
//        stu.insert("student1");
//        stu.delete("student1");
//        stu.update("student1");
//        stu.select();



    }
}