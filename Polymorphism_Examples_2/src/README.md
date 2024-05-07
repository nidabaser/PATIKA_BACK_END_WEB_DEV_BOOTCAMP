# instanceof - polymorphism ilişkisi

- Obje vereceğiz objenin hangi sınıftan olduğuna bakacağız
- Kedi sınıfı aynı zamanda Hayvan sınıfından miras alıyor. Bu yüzden superclass'la kıyaslanırsa inheritance olduğu için true döner.
- Bütün classlar objeden türüyor.(Object class)
- Polymorphism kullanmazsak bütün nesneleri instanceof ile kontrol etmemiz gerekir.
- Yeni bir sınıf üretirsek ve Hayvan sınıfından miras alırsa yine kontrol etmemiz gerekecek ama polymorphism bu iş yükünü azaltıyor.
- Bu örnek Polymorphism'in gerçek faydasını tam olarak ortaya çıkartıyor.
- Daha fazla hata yapma ihtimali, daha fazla kod ve daha fazla manuel kontrol.
- Sonuç olarak, polymorphism kullanmak kod temizliği ve güvenliği açısından verimli bir özellik.