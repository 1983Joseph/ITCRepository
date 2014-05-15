package weather;

public class RainyWeather extends Weather {
    public RainyWeather() {
        temperature = 10;
        relative_humidity = 90;
    }
    public void rainy(){
        System.out.println("Today rainy weather");

    }
}


