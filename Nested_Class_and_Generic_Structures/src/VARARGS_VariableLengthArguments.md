# Değişken sayıdaki metot argümanları (Varargs: variable-length arguments)

Metotların nasıl parametre aldığını daha önce görmüştük. Örneğin aşağıda tanımladığımız toplama metodu 2 parametre almaktadır:

```
public int add(int x, int y)
{
	return x + y;
}
```

Bu metot 2 sayıyı toplar ve sonucunu döndürür. Peki, ya 3 sayıyı toplamak istersek?
Java’da metotları aşırı yükleyebildiğimizi görmüştük. Şimdi bu metodu aşağıdaki gibi aşırı yükleyelim:

```
public int add(int x, int y)
{
	return x + y;
}

public int add(int x, int y, int z)
{
	return x + y + z;
}
```

Artık aynı metodun 2 ve 3 parametre alan farklı varyasyonları var. Peki, ya 4 sayıyı toplamak istiyorsak?
Aynı şekilde metodu aşırı yüklemeye devam edebiliriz:

```
public int add(int x, int y)
{
	return x + y;
}

public int add(int x, int y, int z)
{
	return x + y + z;
}

public int add(int x, int y, int z, int t)
{
	return x + y + z + t;
}
```

Fakat bu yöntemin pek hoş olmadığı gözünüzden kaçmamıştır.
5 veya 6 sayıyı toplamak istediğimizde metodu tekrar aşırı yüklememiz gerekir. Bu durum kod fazlalığına neden olur.
Buradaki sorun, metodun alacağı parametre sayısının belirsiz (değişken) olmasıdır.
Toplama işleminde birden fazla toplanan vardır: fakat sayısı değişken olabilir.
Java, parametre sayısını önceden bilemeyeceğimiz bu gibi durumlar için metodun değişken sayıda argüman (varargs) almasına izin verir.

Değişken sayıda parametre tanımlamak için değişken türünden sonra 3 nokta koyarız.
Artık, metodu çağırırken istediğimiz sayıda parametre verebiliriz:
bunların her biri için metodu aşırı yüklememiz gerekmez. Java bu parametreleri bize bir dizi (array) halinde sunar.

```
public int add(int... numbers)
{
	int sum = 0;
	for (int number : numbers)
	{
		sum += number;
	}
	return sum;
}
```

Yukarıda add() metodumuzu yeniden düzenledik ve toplama işlemine giren eleman sayısının değişken olmasını sağladık.
Artık metoda parametre olarak farklı sayıda toplanan verebiliriz:

```
System.out.println(add(2, 3)); // Konsola 5 yazar
System.out.println(add(1, 5, 7)); // Konsola 13 yazar
System.out.println(add(9)); // Konsola 9 yazar
System.out.println(add(10, 15, 20, 25)); // Konsola 70 yazar
```

Değişken sayıdaki argümanlar bir dizi halinde sunulur. Dizinin elemanı olmayabilir.
Yani, hiç argüman vermesek de değişken sayıda argüman alan metot yine çalışır.

```
System.out.println(add()); // Konsola 0 yazar
```

Yukarıda hiç argüman vermememize rağmen metodun yine çalıştığını görürüz.
Değişken sayıda argüman alan metot yazarken bunu göz önünde bulundurmak gerekir.

Değişken sayıda parametre alan metotları aşırı yükleyebilirsiniz. Aşağıdaki örneği inceleyelim:

```
public int add(int... numbers)
{
	int sum = 0;
	for (int number : numbers)
	{
		sum += number;
	}
	return sum;
}

public double add(double... numbers)
{
	double sum = 0.0;
	for (double number : numbers)
	{
		sum += number;
	}
	return sum;
}
System.out.println(add(5, 4, 3)); // Konsola 12 yazar
System.out.println(add(9.0, 8.5, 8.0)); // Konsola 25.5 yazar
```

Kaynaklar:
w3schools.com
bilgisayarkavramlari.com