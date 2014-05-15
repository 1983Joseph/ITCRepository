package weather;

public class HailWeather extends Weather{

	public HailWeather() {
		setName("Hail");
		setDay_Temperature(8);
		setNight_Temperature(4);
		setRelative_Humidity(75);
	}
	public void rainy(){
		System.out.println(getName());

	}

}
