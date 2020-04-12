package jr.tasks.exception;

public class CatchMany {
    /*
Т.к. все исключения унаследованы от классов Exception или
RuntimeException (который тоже унаследован от Exception),
то их все можно перехватить командами catch (Exception e)
или catch (RuntimeException e).
Отсюда два вывода. Во-первых, с помощью команды catch(Exception e)
можно перехватить любое исключение вообще.
Во-вторых — порядок блоков catch имеет значение.
Примеры:

— Возникший при делении на 0
ArithmeticException будет перехвачен во втором catch.
     */
    public static void main(String[] args) {
        try
        {
            System.out.println("Before method1 calling.");
            int a = 1 / 0;
            System.out.println("After method1 calling. Never will be shown.");
        }
        catch (NullPointerException e)
        {
            System.out.println("Reference is null. Exception has been caught.");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division by zero. Exception has been caught.");
        }
        catch (Exception e)
        {
            System.out.println("Any other errors. Exception has been caught.");
        }
    }
}
/*

 */
