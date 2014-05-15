package weather;

public class SunnyWeather extends Weather {
    public SunnyWeather() {
        temperature = 25;
        relative_humidity = 20;
    }
    public void sunny(){
        System.out.println("Today sunny weather");

    }

}

