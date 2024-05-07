/**
 * @author Nida Başer
 * February 2024
 */
public class Course {
    Teacher courseTeacher; //Niteliklerde bir sınıf varsa en üste yazılır.
    String name;
    String code;
    String prefix;
    int note;
    int sozluNotu;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int sozluNotu = 0;
    }

    void addTeacher(Teacher t){
        if(t.branch.equals(this.prefix)){
            this.courseTeacher = t;
        } else {
            System.out.println(t.name + " branch does not match the course");
        }
    }

    void printTeacher(){
        if (courseTeacher != null) {
            System.out.println(this.name + " course teacher is : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " course has no appointed teacher.");
        }
    }

}
