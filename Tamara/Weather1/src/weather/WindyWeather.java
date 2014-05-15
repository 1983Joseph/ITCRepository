package weather;

public class WindyWeather extends Weather{
	
	public WindyWeather() {
		setName("Windy");
		setDay_Temperature(18);
		setNight_Temperature(15);
		setRelative_Humidity(60);
	}
	public void windy(){
		System.out.println(getName());

	}

	
	

	
}
