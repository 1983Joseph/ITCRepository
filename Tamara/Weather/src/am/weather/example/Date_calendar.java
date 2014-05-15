package am.weather.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_calendar {
	private String t;
	private int r;
	Temp_day day=new Temp_day();
	   DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	   DateFormat dateFormat1 = new SimpleDateFormat("HH");
	   Calendar cal = Calendar.getInstance();
	Date date = new Date();
	public void date_time(){
	t=dateFormat1.format(cal.getTime());
	r=Integer.parseInt(t);
	System.out.println(r);
	}
  
		public int time1(){
	   System.out.println(dateFormat.format(cal.getTime()));
	return 0;
}
		public void ifdate_time(){
			if(r>9 && r<=23){
				day.morning_temp();
			}else{
				day.night_temp();
			}
			
			
		}
		
}
