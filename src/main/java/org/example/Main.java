package org.example;

public class Main {
    public static void main(String[] args) {
        String str = new String("hello world");
        String str1 = new String("hello world");
    }

    public enum CurrencyDenim {
        PENNY,
        NICKLE,
        DIME,
        QUARTER
    }

    static CurrencyDenim getCurrency(CurrencyDenim currencyDenim) {
        return currencyDenim;
    }
}

class MyClass {
    public static final int integer = 777;
    private static String myField;
}

class ClassToTest extends MyClass {

    public int method(int number) {
        return number * super.integer;
    }
}

interface MyInterface {
    int integer = 777;
    int method(int number);
}
