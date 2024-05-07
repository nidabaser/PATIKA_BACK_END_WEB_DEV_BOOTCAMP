// abstract sınıf örneği
public abstract class Doping {

    protected double price;
    protected double[] taxes;

    public double[] getTaxes() {
        return taxes;
    }

    public void setTaxes(double[] taxes) {
        this.taxes = taxes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // soyut metot örneği
    public abstract double calculate();
}