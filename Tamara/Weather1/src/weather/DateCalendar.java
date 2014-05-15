package weather;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateCalendar {
	private String t;
	public int Hour;
	DateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");
	DateFormat DateFormat1 = new SimpleDateFormat("HH");
	Calendar cal = Calendar.getInstance();

	public String DateTime() {
		t = DateFormat1.format(cal.getTime());
		Hour = Integer.parseInt(t);
		if (Hour > 9 && Hour < 23) {
			return "daytime";
		} else {
			return "nighttime";
		}
	}

	public void GetTime() {
		System.out.println(DateFormat.format(cal.getTime()));
		
	}

	
}
