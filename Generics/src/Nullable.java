/**
 * @author Nida Başer
 * March 2024
 */
public class Nullable <T> {
    // HER VERİ TİPİ İÇİN TEK TEK CLASS OLUŞTURMAK YERİNE SADECE
    // BU GENERIC CLASS İÇİNDEN HEPSİNİ KONTROL EDEBİLİRİZ.
    // <T> -->> BU GENERIC CLASS DEMEK
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }

    public void run(){
        if (isNull()){
            System.out.println("Bu değişkene değer atanmamıştır (null)");
        } else {
            System.out.println(this.getValue());
        }
    }
}