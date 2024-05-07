/**
 * @author Nida Başer
 * March 2024
 */
public class Lecturer extends Academician {

    private String doorNumber;

    public Lecturer(String nameSurname, String phoneNumber, String email, String department, String title, String doorNumber) {
        super(nameSurname, phoneNumber, email, department, title);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }
}
