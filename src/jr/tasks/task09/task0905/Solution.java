package jr.tasks.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
Написать метод, который возвращает результат -
глубину его стек-трейса - количество методов в нем
(количество элементов в списке).
Это же число метод должен выводить на экран.


Требования:
1. Метод getStackTraceDepth должен возвращать
глубину своего стек-трейса.
2. Метод getStackTraceDepth должен выводить
на экран глубину своего стек-трейса.
3. Воспользуйся методом Thread.currentThread().getStackTrace().
4. Метод main должен вызывать метод getStackTraceDepth.
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        System.out.println(trace.length);
        return trace.length;
    }
}

