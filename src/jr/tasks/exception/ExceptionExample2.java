package jr.tasks.exception;

/*
В строчке 25 у нас было деление на ноль.
Это привело к возникновению ошибки – исключения.
Java-машина создала объект ArithmeticException с информацией об ошибке.
Этот объект является исключением.
 */

public class ExceptionExample2 {
    public static void main(String[] args) {
        System.out.println("Program starts");

        try {
            System.out.println("Before method1 calling");
            method1();
            System.out.println("After method1 calling. Never will be shown");
        } catch (Exception e) {
            System.out.println("Exception has been caught");
        }

        System.out.println("Program is still running");
    }

    public static void method1() {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }
}
