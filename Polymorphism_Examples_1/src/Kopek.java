/**
 * @author Nida Başer
 * March 2024
 */
class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);     }
    @Override
    public String konus() {
        return this.getIsim() + " Havlıyor...";     }
}
