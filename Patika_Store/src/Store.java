/**
 * @author Nida Başer
 * March 2024
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store {
    private List<Brand> brands;
    private List<Product> mobilePhones;
    private List<Product> notebooks;

    public Store() {
        this.brands = new ArrayList<>();
        this.mobilePhones = new ArrayList<>();
        this.notebooks = new ArrayList<>();

        brands.add(new Brand(1, "Apple"));
        brands.add(new Brand(2, "Asus"));
        brands.add(new Brand(3, "Casper"));
        brands.add(new Brand(4, "HP"));
        brands.add(new Brand(5, "Huawei"));
        brands.add(new Brand(6, "Lenovo"));
        brands.add(new Brand(7, "Monster"));
        brands.add(new Brand(8, "Samsung"));
        brands.add(new Brand(9, "Xiaomi"));
        brands.sort(Comparator.comparing(Brand::getBrandName)); // Alphabetic Sort
    }

    public void addProduct (Product product, int techChoice){
        if (product != null){
            for (Brand brand : brands){
                if (product.getBrand().getBrandName().equals(brand.getBrandName())){
                    if(techChoice == 1){
                        mobilePhones.add(product);
                    }else {
                        notebooks.add(product);
                    }
                    break;
                }
            }
        }
    }

    public void  deleteProduct(int productId){
        // Delete mobile phone with lambda
        mobilePhones.removeIf(product -> product.getId() == productId );
        // Delete notebook with lambda
        notebooks.removeIf(product -> product.getId() == productId );

        // Without using iterator
        /*
        Iterator<Urun> iterator = cepTelefonlari.iterator();
        while (iterator.hasNext()){
            Urun urun = iterator.next();
            if (urun.getId() == urunId){
                iterator.remove();;
            }
        }
        */
    }

    public  void listProducts(){
        System.out.println("Notebook List");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Product Name                      | Price     | Brand     | Storage  | Screen     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Product product : notebooks) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-11d |\n",
                    product.getId(),
                    product.getProductName(),
                    product.getUnitPrice(),
                    product.getBrand().getBrandName(),
                    product.getStorage(),
                    product.getScreenSize(),
                    product.getRam());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("\nMobile Phone List");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Product Name                      | Price     | Brand     | Storage  | Screen     | Camera    | Battery       | RAM       | Color      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (Product product : mobilePhones) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-9d | %-9.1f | %-9d | %-9s |\n",
                    product.getId(),
                    product.getProductName(),
                    product.getUnitPrice(),
                    product.getBrand().getBrandName(),
                    product.getStorage(),
                    product.getScreenSize(),
                    product.getCamera(),
                    product.getBatteryPower(),
                    product.getRam(),
                    product.getColor());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

    }

    public  void listBrands(){
        System.out.println("| ID | Brand Name  |");
        for (Brand brand : brands) {
            System.out.format("| %-1d  | %-1s    |\n",brand.getId(), brand.getBrandName());
        }
    }

    public Brand getBrandById(int id) {
        for (Brand brand : brands) {
            if (brand.getId() == id) {
                return brand;
            }
        }
        return null;
    }



}