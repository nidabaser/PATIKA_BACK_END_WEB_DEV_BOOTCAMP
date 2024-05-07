/**
 * @author Nida Başer
 * March 2024
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Please enter amount: ");
        double price = s.nextDouble();

        System.out.print("Please enter your card number: ");
        String cardNumber = s.next();

        System.out.print("Please enter your card expire date: ");
        String expireDate = s.next();

        System.out.print("Please enter your card CVC: ");
        String cvc = s.next();

        System.out.println("1. A Bank");
        System.out.println("2. B Bank");
        System.out.println("3. C Bank");
        System.out.print("Choose bank: ");

        int selectBank = s.nextInt();

        switch(selectBank){
            case 1:
                AbcBank aPos = new AbcBank("A Bank ", "123456789", "727272");
                aPos.connect("168.1.1.1");
                aPos.payment(price, cardNumber, expireDate, cvc);
                break;
            case 2:
                BcdBank bPos = new BcdBank("B Bank ", "123456789", "727272");
                bPos.connect("123.1.1.1");
                bPos.payment(price, cardNumber, expireDate, cvc);
                break;
            default:
                System.out.println("Invalid bank selection");
        }
    }
}