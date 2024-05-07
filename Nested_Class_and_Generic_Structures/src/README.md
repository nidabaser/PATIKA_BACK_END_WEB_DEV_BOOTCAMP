# Nested Classes (İç İçe Sınıflar)

Şu ana kadar sınıfların içinde değişkenlerin ve metotların bulunabileceğini biliyorduk. 
Fakat sınıfların gücü bununla sınırlı değildir.
Sınıfların içinde başka sınıflar da tanımlayabiliriz.
Bu şekilde iç içe sınıflar (nested classes) oluşturabiliriz.

İç içe tanımlanan sınıfları tabir ederken,
diğerini kapsayan sınıfa dıştaki sınıf (outer class),
içeride bulunan sınıfa ise içteki sınıf (inner class) deriz.

Bir sınıf oluşturulduğunda bütün alanlarının ve metotlarının hafızaya yüklendiğini söylemiştik.
Bu durum içteki sınıflar için de geçerlidir.
İç içe sınıflarda, içteki sınıfı kullanabilmemiz için dıştaki sınıfın bir örneğinin alınması gerekir.

İçteki sınıf, dıştaki sınıfın bütün alanlarına ve metotlarına erişebilir.
Dıştaki sınıf tek olmasına rağmen, içteki sınıfın birden fazla örneği alınabilir;
bu gibi durumlarda içteki sınıftan oluşturulan nesnelerin hepsi aynı dıştaki sınıfa erişir.

Peki iç içe sınıfları ne zaman kullanmalıyız ?
Bir sınıfın varlığı başka bir sınıfa bağlı ise, tek başına var olması mümkün değilse
iç içe sınıfları kullanabiliriz. Örneğin bir üniversiteyi düşünecek olursak,
her bölüm varlık için bir fakülteye ihtiyaç duyuyorsa,
bu bölümün fakülte olmadan varlığının bir anlamı yoksa iç içe sınıflar kullanılabilir.
Fakat fakülteden bağımsız bölümler veya birden fazla fakülteye bağlı olan bölümler için
iç içe sınıflar kullanmak hatalı bir yaklaşım olacaktır.

```java
class Outer
{
public void run()
{
System.out.println("Dıştaki sınıfın metodu çalıştı.");
Inner inner = new Inner();
inner.run();
}

    class Inner
	{
		public void run()
		{
			System.out.println("İçteki sınıfın metodu çalıştı.");
		}
	}
}
```

Yukarıdaki örnekte iç içe 2 sınıf oluşturduk. Her ikisine de run() adında metotlar yazdık.

```
Outer outer = new Outer();
outer.run();
```

Yukarıdaki kodu çalıştırdığımızda çıktısı aşağıdaki gibi olur:

Dıştaki sınıfın metodu çalıştı.
İçteki sınıfın metodu çalıştı.

Şimdi de aşağıdaki örneği inceleyelim:

```
class Outer
{
private int number = 10;

    public void run()
    {
		System.out.println(number);
        
		Inner inner = new Inner();
		inner.run();
		
        System.out.println(number);
	}

    class Inner
	{
		public void run()
		{
			number++;
		}
	}
}
```

Yukarıdaki örnekte dıştaki sınıfın içinde number isminde bir değişken oluşturduk.
İçteki sınıfta ise bu değişkene erişip değerini 1 artırdık.
Dıştaki sınıfın run() metodunu çalıştırdığınızda çıktısı aşağıdaki gibi olur:

10
11

Buradan da görebileceğiniz gibi, içteki sınıflar dıştaki sınıfların elemanlarına erişebilir.

İç içe sınıflarla ilgili dikkat etmemiz gereken bazı noktalar vardır.
İlk olarak, dıştaki sınıf olmadan içteki sınıfın bir örneğini alamayız.
Ayrıca, içteki sınıfın içine statik bir değişken veya metot yazamayız.
Bu kısıtlamaların önüne geçmek için içteki sınıfı statik olarak tanımlamalıyız.

İçteki sınıfı statik yapmak


Hatırlarsınız: bir metodu kullanabilmek için tanımlandığı sınıfın bir örneğini almamız gerekiyordu.
Bunun önüne geçmek için metodu statik olarak belirtiyorduk. Aynı durum içteki sınıflar için de geçerlidir:
bu sınıfları kullanabilmek için dıştaki sınıfın örneğini almamız gerekir. Bunun önüne geçmek için içteki sınıfı statik olarak tanımlamalıyız:

```java
class Outer
{
static class Inner
{
public void run()
{
System.out.println("İçteki sınıfın metodu çalıştı");
}
}
}
```

Şimdi aşağıdaki kodu çalıştırabiliriz:

```
Outer.Inner inner = new Outer.Inner();
inner.run();
```

Gördüğünüz gibi, artık içteki sınıfın bir örneğini alabilmek için dıştaki sınıfa ihtiyacımız yoktur.
Fakat, statik metotların sınıfın statik olmayan alanlarına erişemeyeceğini hatırlayın.
Aynı durum burada da geçerlidir: içteki statik sınıflar dıştaki sınıfın statik olmayan alanlarına erişemez:

```
class Outer
{
private int number = 10;

    public void run()
	{
		System.out.println(number);
        
		Inner inner = new Inner();
		inner.run();
        
		System.out.println(number);
	}

    static class Inner
	{
		public void run()
		{
			number++; // Bu satır hataya neden olur
		}
	}
}
```

Yukarıdaki kod hataya neden olur; çünkü statik olarak belirlenmiş içteki Inner sınıfı
dıştaki sınıfın statik olmayan number değişkenine erişmeye çalışıyor.


İçteki sınıfı private yapmak


İçteki sınıflar static yapılabildiği gibi, içteki sınıfa dışarıdan bir erişim sağlanmasının önüne geçmek için
private ve protected erişim belirleyicileri de kullanılabilir.

```
class Outer {
int x = 10;

private class Inner {
int y = 5;
}
}

public class Main {
public static void main(String[] args) {
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();
System.out.println(inner.y + outer.x);
}
}
```

Yukarıdaki kod dışarıdan, private bir sınıfa erişmek istediği için hataya neden olur.