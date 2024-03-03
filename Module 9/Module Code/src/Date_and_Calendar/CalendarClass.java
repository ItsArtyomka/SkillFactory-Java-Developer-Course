package Date_and_Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        // Example of code using Calendar class
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(java.util.Calendar.YEAR);
        int month = calendar.get(java.util.Calendar.MONTH);
        int dayOfMonth = calendar.get(java.util.Calendar.DAY_OF_MONTH);
        int hourOfDay = calendar.get(java.util.Calendar.HOUR_OF_DAY);
        int minute = calendar.get(java.util.Calendar.MINUTE);

        System.out.println("Time: " + hourOfDay + ":" + minute + " | Date: " + dayOfMonth + "." + (month + 1) + "." + year);

        //--OR--

        Calendar simpleCalendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss z");

        System.out.println("Time and Date right now: " + dateFormat.format(simpleCalendar.getTime()));
    }
}
