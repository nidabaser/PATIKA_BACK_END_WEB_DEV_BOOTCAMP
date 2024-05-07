/**
 * @author Nida Başer
 * March 2024
 */

//Outer Class
public class OuterClass {
    public int a = 5;
    public static int b = 20;

    //Inner Class
    public class InnerClass {
        // NON STATIC
        //public int a = 10;

        // STATIC
        public static int a = 10;

        public static void run() {
            System.out.println("Inner Class's run method is executed");
            int a = 1;
            System.out.println("Inner Local Variable: " + a);
            System.out.println("Inner Class Variable: " + InnerClass.a);
            System.out.println("Outer Class Variable: " + OuterClass.b);
        }

        /* NON STATIC
         public void run(){
            System.out.println("Inner Class's run method is executed");
            int a=1;
            System.out.println("Inner Local Variable: " + a);
            System.out.println("Inner Class Variable: " + this.a);
            System.out.println("Outer Class Variable: " + OuterClass.this.a);
        }
         public void run(){
            InnerClass inner = new InnerClass();
            inner.run();
         }
        */

    }
}