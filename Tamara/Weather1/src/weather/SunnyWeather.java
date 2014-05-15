package weather;

public class SunnyWeather extends Weather {

	public SunnyWeather() {
	setName("Sanny");
	setDay_Temperature(30);
	setNight_Temperature(22);
	setRelative_Humidity(25);
		// TODO Auto-generated constructor stub
	}

	public void sunny(){
		System.out.println(getName());
	}

}
