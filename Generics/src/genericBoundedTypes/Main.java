/**
 * @author Nida Başer
 * March 2024
 */
package genericBoundedTypes;
public class Main {
    public static void main(String[] args){
        // GENERIC BOUNDED TYPES
        // Integer, Double, Float extends Number

//        Integer a = null;
//        Nullable<Integer> n1 = new Nullable<>(12);
//        Nullable<Integer> n2 = new Nullable<>(a);

        // Extend ettiğimiz sınıf number old. için
        // String koyamayız hata verir.
        String str = "java";
        //Nullable<String> n2 = new Nullable<>(str);

//        n1.run();
//        n2.run();


        // GENERIC UPPER BOUNDED TYPE
        SubClassB aObject = null;
        Nullable<SubClassB> n1 = new Nullable<>(aObject);
        n1.run();

    }
}
