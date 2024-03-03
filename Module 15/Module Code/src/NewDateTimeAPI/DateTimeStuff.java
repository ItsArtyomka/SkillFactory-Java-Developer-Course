package NewDateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeStuff {

    public static void main(String[] args) throws InterruptedException {
        //--- Exercise 15.1.1 ---
        ZonedDateTime local = ZonedDateTime.now();
        ZonedDateTime moscow = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        while (true){
            System.out.println("Local TimeDate: " + local);
            System.out.println("Moscow TimeDate: " + moscow);
            Thread.sleep(1000);
        }
    }
}
