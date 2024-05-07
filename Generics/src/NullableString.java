/**
 * @author Nida Başer
 * March 2024
 */
public class NullableString {
    private final String value;

    public NullableString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }

    public void print(){
        if (isNull()){
            System.out.println("Bu değişkene değer atanmamıştır");
        } else {
            System.out.println(this.getValue());
        }
    }
}
