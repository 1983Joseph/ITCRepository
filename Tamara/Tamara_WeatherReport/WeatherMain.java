//package weather;
import weather.*;
public class WeatherMain {

    public static void main(String[] args) {
        DateCalendar day = new DateCalendar();
        SunnyWeather s= new SunnyWeather();
        day.time1();
        s.sunny();
        s.temp_date();
        s.RelHum();
    }

}

