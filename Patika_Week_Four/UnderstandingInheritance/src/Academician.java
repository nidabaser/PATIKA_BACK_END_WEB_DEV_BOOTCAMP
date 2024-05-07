import java.text.AttributedCharacterIterator;

/**
 * @author Nida Başer
 * March 2024
 */
public class Academician extends Employee{

    private String department;
    private String title;

    public Academician(String nameSurname, String phoneNumber, String email, String department, String title) {
        super(nameSurname, phoneNumber, email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void enterLesson(){
        System.out.println(this.getNameSurname() + " entered the lesson");
    }

}
