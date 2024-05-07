/**
 * @author Nida Başer
 * February 2024
 */
public class Main {
    public static void main(String[] args) {

        Course maths = new Course("Maths", "MAT101", "MAT");
        Course physics = new Course("Physics", "PHY102", "PHY");
        Course biology = new Course("Biology", "BIO101", "BIO");

        Teacher t1 = new Teacher("Mahmut Hoca", "905555555555", "MAT");
        Teacher t2 = new Teacher("Albert Einstein", "109990009999", "PHY");
        Teacher t3 = new Teacher("Aziz Sancar", "905557778899", "BIO");

        maths.addTeacher(t1);
        physics.addTeacher(t2);
        biology.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "111", 4, maths, physics, biology);
        s1.maths.sozluNotu = 50;
        s1.physics.sozluNotu = 35;
        s1.biology.sozluNotu = 25;
        s1.addBulkExamNote(100, 75, 50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "222", 4, maths, physics, biology);
        s2.maths.sozluNotu = 70;
        s2.physics.sozluNotu = 85;
        s2.biology.sozluNotu = 20;
        s2.addBulkExamNote(50, 25, 50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "333", 4, maths, physics, biology);
        s3.maths.sozluNotu = 50;
        s3.physics.sozluNotu = 60;
        s3.biology.sozluNotu = 75;
        s3.addBulkExamNote(50, 20, 45);
        s3.isPass();
    }
}