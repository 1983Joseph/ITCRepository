package weather;

public class RainyWeather extends Weather {
	
	
	public RainyWeather() {
		setName("Rainy");
		setDay_Temperature(20);
		setNight_Temperature(12);
		setRelative_Humidity(90);
	}
	public void rainy(){
		System.out.println(getName());

	}

}
