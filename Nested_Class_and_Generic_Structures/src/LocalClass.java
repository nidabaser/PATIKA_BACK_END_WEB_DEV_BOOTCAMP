/**
 * @author Nida Başer
 * March 2024
 */
public class LocalClass {

    public void run(){

        class Yerel{
            private int a;

            public Yerel (int a) {
                    this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }

        Yerel y = new Yerel(15);

        System.out.println("Local class is executed !");

        System.out.println(y.getA());
    }

    /*
    // CANNOT CREATE OBJECT OUT OF LOCAL CLASS
    public void print(){
        Yerel y = new Yerel();
    }
    */

}
