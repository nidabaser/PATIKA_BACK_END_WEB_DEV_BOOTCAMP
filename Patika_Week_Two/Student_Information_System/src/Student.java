/**
 * @author Nida Başer
 * February 2024
 */
public class Student {
    Course maths; //Class nesneleri en üste koyulur
    Course physics;
    Course biology;
    String name;
    String stuNo;
    int classes;
    double average;
    boolean isPass;

    Student (String name, String stuNo, int classes, Course maths, Course physics, Course biology) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.maths = maths;
        this.physics = physics;
        this.biology = biology;
        calcAverage();
        this.isPass = false;
    }

    void addBulkExamNote (int maths, int physics, int biology) {

        if(maths >= 0 && maths <= 100){
            this.maths.note = maths;
        }

        if(physics >= 0 && physics <= 100){
            this.physics.note = physics;
        }

        if(biology >= 0 && biology <= 100){
            this.biology.note = biology;
        }

    }

    void isPass () {
        System.out.println("****************************");
        if (this.maths.note == 0 || this.physics.note == 0 || this.biology.note == 0) {
            System.out.println("Notes are not entered completely");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage() {
        double mathAvg = (this.maths.note*0.8 + this.maths.sozluNotu*0.2);
        double phyAvg = (this.physics.note*0.8 + this.physics.sozluNotu*0.2);
        double bioAvg = (this.biology.note*0.8 + this.biology.sozluNotu*0.2);

        this.average = (mathAvg + phyAvg + bioAvg) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    void printNote(){
        System.out.println(this.maths.name + " Notu\t\t:" + this.maths.note);
        System.out.println(this.physics.name + " Notu\t:" + this.physics.note);
        System.out.println(this.biology.name + " Notu\t:" + this.biology.note);
    }

}
