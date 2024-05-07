/**
 * @author Nida Başer
 * March 2024
 */
class At extends Hayvan {
    public At(String isim) {
        super(isim);     }

    @Override
    public String konus() {
        return this.getIsim() + " Kişniyor...";     }
}