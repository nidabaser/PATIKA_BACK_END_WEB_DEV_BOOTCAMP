/**
 * @author Nida Başer
 * March 2024
 */
public class BcdBank implements IBank{
    private String bankName;
    private String terminalID;
    private String password;

    public BcdBank(String bankName, String terminalID, String password) {
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }

    // There is no need for these following methods anymore because we implemented them from the interface.
//    public void connection(String str){
//        System.out.println(this.bankName + " connected...");
//    }
//
//    public void sendPayment(double price){
//        System.out.println("Waiting for Bank to response...");
//        System.out.println("Transaction confirmed !");
//    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("User IP: " + ipAddress);
        System.out.println("Machine IP: " + this.hostIpAddress);
        System.out.println(this.bankName + " connected...");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expireDate, String cvc) {
        System.out.println("Waiting for Bank to response...");
        System.out.println("Transaction confirmed !");
        return true;
    }
}
