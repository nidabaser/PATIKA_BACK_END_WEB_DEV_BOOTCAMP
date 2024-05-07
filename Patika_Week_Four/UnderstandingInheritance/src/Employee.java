/**
 * @author Nida Başer
 * March 2024
 */
public class Employee {
    private String nameSurname;
    private String phoneNumber;
    private String email;

    public Employee(String nameSurname, String phoneNumber, String email) {
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void enter() {
        System.out.println(this.nameSurname + " entered University");
    }

    public void exit() {
        System.out.println(this.nameSurname + " left the University");
    }

    public void cafeteria() {
        System.out.println(this.nameSurname + " entered University Cafeteria");
    }

}