package jr.tasks.date;

import java.util.Date;

public class DateCaurrentToday {
//    Сколько прошло времени с начала сегодняшнего дня:
//
    public static void main(String[] args) throws Exception
    {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int minutes = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + minutes + ":" + secs);
    }

}
