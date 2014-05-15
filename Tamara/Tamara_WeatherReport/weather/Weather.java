package weather;
import weather.DateCalendar; 
public class Weather {

    protected int temperature, relative_humidity;
    public Weather(){
        temperature=20;
        relative_humidity=40;
    }      
    DateCalendar timeday=new DateCalendar();
    public void temp_date(){
        System.out.println(timeday.date_time()+" "+temperature+" 0C");
    }
    public void  RelHum(){
        System.out.println("Relativ humidity = "+relative_humidity+"%");
    }



}



