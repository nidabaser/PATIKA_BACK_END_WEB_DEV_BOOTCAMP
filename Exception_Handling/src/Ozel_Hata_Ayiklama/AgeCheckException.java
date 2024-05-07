/**
 * @author Nida Başer
 * March 2024
 */
package Ozel_Hata_Ayiklama;

public class AgeCheckException extends Exception {

    public AgeCheckException(String message) {
        super(message);
        //System.out.println("Hatalı yaş yakalandı");
    }

    @Override
    public String toString() {
        return "Bu AgeCheckException sınıfına ait bir exception'dır.";
        //return super.toString();
    }
}
