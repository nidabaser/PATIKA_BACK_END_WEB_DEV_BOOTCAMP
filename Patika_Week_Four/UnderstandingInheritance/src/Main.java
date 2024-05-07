/**
 * @author Nida Başer
 * March 2024
 */
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Sena Başer", "5555555555", "sena@university.edu.tr");
        //e1.enter();

        Academician a1 = new Academician("Nida Başer", "5555555555", "nida@university.edu.tr", "Computer Science","Professor");
        //a1.enterLesson();

        Employee o1 = new Officer("Ali Veli", "1112223344","ali@patika.dev", "Bilgi İşlem", "09:00 - 18:00");
        // o1.work(); ÇALIŞMAZ

        Lecturer l1 = new Lecturer("Nurgül Başer", "5556667788", "nurgul@ogu.edu.tr", "Theology", "Professor","017");
        l1.enter();
        l1.enterLesson();
        System.out.println(l1.getDoorNumber());
    }
}