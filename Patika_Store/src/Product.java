/**
 * @author Nida Başer
 * March 2024
 */
public class Product {
    private static int idCounter = 1;
    private int id;
    private double unitPrice;
    private double discountRate;
    private int stockAmount;
    private String productName;
    private Brand brand;
    private int storage;
    private double screenSize;
    private int camera;
    private double batteryPower;
    private int ram;
    private String color;

    public Product (double unitPrice, int stockAmount, String productName, Brand brand, int storage, double screenSize, int camera, double batteryPower) {
        this.id = idCounter++;
        this.unitPrice = unitPrice;
        this.stockAmount = stockAmount;
        this.productName = productName;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.camera = camera;
        this.batteryPower = batteryPower;
    }

    public Product (double unitPrice, int stockAmount, String productName, Brand brand, int storage, double screenSize, int ram) {
        this.id = idCounter++;
        this.unitPrice = unitPrice;
        this.stockAmount = stockAmount;
        this.productName = productName;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public Product (double unitPrice, double discountRate, int stockAmount, String productName, Brand brand, int storage, double screenSize, int camera, double batteryPower, int ram, String color) {
        this.id = idCounter++;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.productName = productName;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.camera = camera;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(double batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
