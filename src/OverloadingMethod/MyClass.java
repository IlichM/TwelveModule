package OverloadingMethod;

public class MyClass {
    int number;
    char symbol;

    void set(int n) {
        number = n;
    }
    void set(char s) {
        symbol = s;
    }
    void set(int n, char s) {
        set(n);
        set(s);
    }
    void set() {
        set(0,'Z');
    }
    void show() {
        System.out.println("Значение полей " + number + " и " + symbol);
    }
    void show(String text) {
        System.out.println(text+": значения полей " + number + " и " + symbol);
    }
    void show(String text1, String text2) {
        System.out.println(text1+": "+number);
        System.out.println(text2+": "+symbol);
    }
}
