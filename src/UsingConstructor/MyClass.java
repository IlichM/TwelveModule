package UsingConstructor;

public class MyClass {
    int number;
    char symbol;
    MyClass() {
        number = 100;
        symbol = 'A';
    }
    MyClass(int n, char s) {
        number = n;
        symbol = s;
    }
    void show() {
        System.out.println("Значения полей "+number+" и "+symbol);
    }

}
