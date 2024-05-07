# Custom Exception
Java'da özel hata sınıfları (custom exceptions) yaratmak, belirli hataları daha spesifik bir şekilde ifade etmek ve
yakalamak için kullanılır. Özel hatalar, genellikle standart Java hatalarının alt sınıfları olarak tanımlanır.

Özel hata sınıfı yaratmak için genel yaklaşımı:

````java
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
````

Bu sınıf Exception sınıfını genişletir ve bir mesaj alabilen bir yapılandırıcıya sahiptir.
Bu sınıfı kullanarak bir hata atabiliriz:

````java
public class Main {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception.");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
````

Bu kodda, CustomException hata tipinde bir hata oluşturup atıyoruz ve
bu hatayı catch bloğunda yakalayıp hata mesajını yazdırıyoruz.

İsterseniz, özel hatalarınızı daha da özelleştirebilir ve
belirli hataları daha spesifik bir şekilde temsil eden hatalar yaratabilirsiniz.
Örneğin, bir "InvalidAgeException" yaratalım:

````java
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
````

Bu hata, yaş kontrolü yapan bir metot için de kullanılabilir:

````java
public class Main {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        } else if (age > 120) {
            throw new InvalidAgeException("Age cannot be more than 120.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkAge(125);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
````

Bu örneklerde, "InvalidAgeException" özel hata sınıfını, geçersiz bir yaş değeri verildiğinde atılmak üzere kullanıyoruz.

Özel hatalar yaratmak, kodunuzda belirli hataları daha spesifik bir şekilde temsil etmek ve
bu hataları daha kolay yönetmek için oldukça yararlıdır. Özellikle büyük ve karmaşık projelerde,
özel hataların kullanımı genellikle daha okunabilir ve yönetilebilir kod oluşturur.

Bir string'in sayıya dönüştürülmesi esnasında bir hata meydana gelirse aşağıdaki gibi özel hata türü oluşturabiliriz.

````java
public class NumberFormatException extends Exception {
    public NumberFormatException(String message) {
        super(message);
    }
}
````

Bu hata sınıfını kullanarak bir stringi sayıya dönüştürme işlemi gerçekleştiren bir metot yazabiliriz:

````java
public class Main {
    public static int convertStringToNumber(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number format: " + str);
        }
    }

    public static void main(String[] args) {
        try {
            int number = convertStringToNumber("123a");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
````

Bir stringin boş olup olmadığını kontrol eden bir metot yazarken bu özel hata türünü oluşturabiliriz.

````java
public class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}
````

Bu hata sınıfını kullanarak bir stringin boş olup olmadığını kontrol eden bir metot yazabiliriz:

````java
public class Main {
    public static void checkStringNotEmpty(String str) throws EmptyStringException {
        if (str == null || str.trim().isEmpty()) {
            throw new EmptyStringException("String is empty or null.");
        }
    }

    public static void main(String[] args) {
        try {
            checkStringNotEmpty("");
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkStringNotEmpty("   ");
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkStringNotEmpty(null);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }
}
````

Bu örneklerde, özel hatalarımızı kullanarak belirli durumlarda hatayı daha iyi kontrol edebiliyor ve
daha anlamlı hata mesajları oluşturabiliyoruz. Bu da hataları bulmayı ve düzeltmeyi kolaylaştırır.