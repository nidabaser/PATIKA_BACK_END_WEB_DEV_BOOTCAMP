# Dinamik Diziler (ArrayList)

Java'da, "ArrayList" adlı bir sınıf bulunur.
ArrayList, genellikle dizi boyutunun dinamik olarak değişebildiği durumlarda kullanılan bir veri yapısıdır.
Yani, eleman ekledikçe ve çıkardıkça ArrayList'in boyutu otomatik olarak ayarlanır.

- Örnek 1: ArrayList tanımlama
```
ArrayList<string> liste = new ArrayList<>();</string>
```
Bu örnekte, String türünde verileri tutabileceğimiz bir ArrayList oluşturduk.

- Örnek 2: ArrayList'e Eleman Ekleme - liste.add("Merhaba");
```
ArrayList<string> liste = new ArrayList<>();

liste.add("Merhaba");
liste.add("Dünya");</string>
```
Bu örnekte, ArrayList'e "Merhaba" ve "Dünya" adlı iki eleman ekledik.

- Örnek 3: ArrayList'teki Elemanları Yazdırma
```
ArrayList<string> liste = new ArrayList<>();

liste.add("Merhaba");
liste.add("Dünya");

for(String s : liste) {    
System.out.println(s);
}</string>
```
Bu örnekte, ArrayList'teki tüm elemanları yazdırıyoruz.

- Örnek 4: ArrayList'ten Eleman Çıkarma - liste.remove("Merhaba");
```
ArrayList<string> liste = new ArrayList<>();

liste.add("Merhaba");
liste.add("Dünya");
liste.remove("Merhaba");</string>
```
Bu örnekte, ArrayList'ten "Merhaba" adlı elemanı çıkardık.

- Örnek 5: ArrayList'in Boyutunu Öğrenme - liste.size()
```
ArrayList<string> liste = new ArrayList<>();

liste.add("Merhaba");
liste.add("Dünya");
System.out.println(liste.size());</string>
```
Bu örnekte, ArrayList'in boyutunu (içerdiği eleman sayısını) yazdırıyoruz.

- Örnek 6: ArrayList'teki Belirli Bir Elemana Erişme - liste.get(1)
```
ArrayList<string> liste = new ArrayList<>();

liste.add("Merhaba");
liste.add("Dünya");
System.out.println(liste.get(1));</string>
```
Bu örnekte, ArrayList'in 1. indeksindeki elemanı yazdırıyoruz.

- Örnek 7: ArrayList'teki Elemanları Sıralama - Collections.sort(liste);
```
ArrayList<string> liste = new ArrayList<>();

liste.add("Merhaba");
liste.add("Dünya");
Collections.sort(liste);</string>
```
Bu örnekte, ArrayList'teki elemanları sıralıyoruz.

- Örnek 8: ArrayList'teki Belirli Bir Elemanın Varlığını Kontrol Etme - liste.contains("Merhaba")
```
ArrayList<string> liste = new ArrayList<>();

liste.add("Merhaba");
liste.add("Dünya");
System.out.println(liste.contains("Merhaba"));</string>
```
Bu örnekte, ArrayList'in "Merhaba" adlı elemanı içerip içermediğini kontrol ediyoruz.

- Örnek 9: ArrayList'i Temizleme - liste.clear();
```
ArrayList<string> liste = new ArrayList<>();

liste.add("Merhaba");
liste.add("Dünya");
liste.clear();</string>
```
Bu örnekte, ArrayList'in tüm elemanlarını çıkarıyoruz.

- Örnek 10: ArrayList'teki Belirli Bir Elemanın İndeksini Bulma - liste.indexOf("Dünya")
```
ArrayList<string> liste = new ArrayList<>();

liste.add("Merhaba");
liste.add("Dünya");
System.out.println(liste.indexOf("Dünya"));</string>
```
Bu örnekte, "Dünya" adlı elemanın ArrayList içindeki indeksini buluyoruz.