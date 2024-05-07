public class UptodateDoping extends Doping {

    public UptodateDoping(double price, double[] taxes) {
        super.setPrice(price);
        super.setTaxes(taxes);
    }

    // "Doping" soyut sınıfından kalıtımla gelen, "calculate" isimli soyut metodu metot ezmesi yöntemiyle alt sınıf kendi ihtiyacına göre dolduruyor.
    // "UptodateDoping" isimli doping tipinde vergiler fiyata dahil olduğu için komisyon oranı eklenip ve vergiler hesaplanıp ücret belirleniyor.
    // Görüldüğü gibi her doping çeşidinin fiyat hesaplama yöntemleri birbirinden farklıdır. Soyutlama ile sınıflara ait iç çalışma detayları gizlenmmiş oluyor.
    // Doping tiplerinde sadece "calculate" isimli fonksiyonu dış dünyaya açtık. Diğer tüm fonksiyonlar ve özellikler sınıf içinde kaldı.
    @Override
    public double calculate() {

        return calculateTaxes() + commisionRate();
    }

    private double calculateTaxes() {

        double totalTaxValue = 0;
        for (int i = 0; i < super.getTaxes().length; i++) {
            totalTaxValue += super.getTaxes()[i];
        }
        return totalTaxValue;
    }

    private double commisionRate() {
        return super.getPrice() * 0.2;
    }
}
