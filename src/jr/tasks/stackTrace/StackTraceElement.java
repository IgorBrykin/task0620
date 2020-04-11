package jr.tasks.stackTrace;

public class StackTraceElement {
    public static void main(String[] args)
    {
        method1();
    }

    public static void method1()
    {
        method2();
    }

    public static void method2()
    {
        method3();
    }

    public static void method3()
    {
//        Каждый StackTraceElement содержит информацию о методе,
//        который был вызван. В частности можно получить имя этого метода
//        с помощью функции getMethodName.
        java.lang.StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (java.lang.StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
    }
}
