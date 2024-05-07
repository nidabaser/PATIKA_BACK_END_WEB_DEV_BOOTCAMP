/**
 * @author Nida Başer
 * March 2024
 */
public class PrintArrays {
    public static <T, U> void printArray(T[] arr, U[] arr2){

        for (T i:arr){
            System.out.println(i);
        }
        // BİRDEN ÇOK PARAMETRE DE ALABİLİR.
        for (U i:arr2){
            System.out.println(i);
        }
    }
}
