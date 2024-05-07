/**
 * @author Nida Başer
 * March 2024
 */
public interface IBank {

    // We cannot create a variable that does not have a default value in interfaces
    // But we can create final variables in interfaces

    final String hostIpAddress = "127.0.0.1";

    boolean connect(String ipAddress);

    boolean payment(double price, String cardNumber, String expireDate, String cvc);

}
