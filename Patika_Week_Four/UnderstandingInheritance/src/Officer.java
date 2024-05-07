/**
 * @author Nida Başer
 * March 2024
 */
public class Officer extends Employee{

    private String departman;
    private String shift;

    public Officer(String nameSurname, String phoneNumber, String email, String departman, String shift) {
        super(nameSurname, phoneNumber, email);
        this.departman = departman;
        this.shift = shift;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work(){
        System.out.println(this.getNameSurname() + " is working");
    }

}
