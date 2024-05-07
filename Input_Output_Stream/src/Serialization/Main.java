/**
 * @author Nida Başer
 * March 2024
 */
package Serialization;
import java.io.*;

public class Main {
    public static void main(String[] args){

        // Programdan dışarıya bir çıktı vermek, yazı yazdırmak için output oluşturmamız gerekiyor
//        Car c1 = new Car("Audi", "A3");
//        try {
//            FileOutputStream outputFile = new FileOutputStream("car.txt");
//            ObjectOutputStream output = new ObjectOutputStream(outputFile);
//            output.writeObject(c1);
//            output.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        // Programdan dışarıdaki verileri okumak için input oluşturmamız gerekiyor.
        // car.txt içindeki tüm serileşmiş verileri okumak
        Car c1 = new Car("Audi", "A3");
        try {
            FileInputStream inputFile = new FileInputStream("car.txt");
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);

            Car newCar = (Car)inputStream.readObject(); // explicit tür dönüşümü Car türünden old. belirttik. implicit(üstü kapalı) değil explicit(bilerek)
            System.out.println(newCar.getBrand()); // Okuyup okumadığını görmek için
            System.out.println(newCar.getModel());

            inputFile.close();
            inputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
