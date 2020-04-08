package jr.tasks.date;

import java.util.Date;

//Получение текущей даты:
public class DataNow {
    public static void main(String[] args) throws Exception {
        Date today = new Date();
        System.out.println("Current date: " + today);
    }
}
