package NewDateTimeAPI;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class ZonedDateTimeStuff {
    public static void main(String[] args) {
        Instant instant2 = new Date().toInstant();
        ZonedDateTime zdt = instant2.atZone(ZoneId.systemDefault());
        System.out.println(zdt);
    }
}
