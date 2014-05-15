package weather;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateCalendar {
    private String t;
    public int hour;
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat dateFormat1 = new SimpleDateFormat("HH");
    Calendar cal = Calendar.getInstance();

    public String date_time() {
        t = dateFormat1.format(cal.getTime());
        hour = Integer.parseInt(t);
        if (hour > 9 && hour < 23) {
            return "daytime";
        } else {
            return "nighttime";
        }
    }

    public void time1() {
        System.out.println(dateFormat.format(cal.getTime()));
    }

}

