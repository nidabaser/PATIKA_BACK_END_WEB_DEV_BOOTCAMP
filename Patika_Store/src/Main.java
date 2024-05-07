/**
 * @author Nida Başer
 * March 2024
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Patika Store !");

        Store patikaStore = new Store();
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("1. Add Product");
            System.out.println("2. List Products");
            System.out.println("3. Delete Product");
            System.out.println("4. List Brands");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            s.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter (1) for mobile phone\nEnter (2) for notebook ");
                    int techChoice = s.nextInt();

                    System.out.print("Product Name: ");
                    String productName = s.next();

                    System.out.print("Unit Price: ");
                    double unitPrice = s.nextDouble();

                    System.out.print("Amount of Stock: ");
                    int stockAmount = s.nextInt();

                    System.out.print("Brand ID: ");
                    int brandId = s.nextInt();

                    s.nextLine();
                    Brand brand = patikaStore.getBrandById(brandId);

                    if (brand != null) {
                        int storage, camera, ram;
                        double screenSize, batteryPower;

                        if (techChoice == 1) {
                            System.out.print("Storage (GB): ");
                            storage = s.nextInt();

                            System.out.print("Screen size (inch): ");
                            screenSize = s.nextDouble();

                            System.out.print("Camera (MP): ");
                            camera = s.nextInt();

                            System.out.print("Battery Power (mAh): ");
                            batteryPower = s.nextDouble();

                            Product mobilePhone = new Product(unitPrice, stockAmount, productName, brand, storage, screenSize, camera, batteryPower);
                            patikaStore.addProduct(mobilePhone, techChoice);

                        } else {

                            System.out.print("Storage (GB): ");
                            storage = s.nextInt();

                            System.out.print("RAM (GB): ");
                            ram = s.nextInt();

                            System.out.print("Screen Size (inch): ");
                            screenSize = s.nextDouble();

                            Product notebook = new Product(unitPrice, stockAmount, productName, brand, storage, screenSize, ram);
                            patikaStore.addProduct(notebook, techChoice);

                        }
                        System.out.println("Product Succesfully Added !");
                    } else {
                        System.out.println("Invalid brand ID !");
                    }
                    break;
                case 2:
                    patikaStore.listProducts();
                    break;
                case 3:
                    System.out.print("Enter the product ID you want to delete: ");
                    int deleteId = s.nextInt();
                    patikaStore.deleteProduct(deleteId);
                    System.out.println("Product is deleted");
                    break;
                case 4:
                    patikaStore.listBrands();
                    break;
                case 5:
                    System.out.println("Exit...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice...");

            }
        }
    }
}
