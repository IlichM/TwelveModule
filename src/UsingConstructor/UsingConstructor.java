package UsingConstructor;

public class UsingConstructor {
    public static void main(String[] args) {
        MyClass objA = new MyClass();
        MyClass objB = new MyClass(200, 'B');
        System.out.println("Объект objA: ");
        objA.show();
        System.out.print("Объект objB: ");
        objB.show();
    }
}
