package weather;

public class Weather {

	private int Day_Temperature;
	private int Night_Temperature;
	private int Relative_Humidity;
	private String Name;
	DateCalendar TimeDay = new DateCalendar();

	public void Temp_Date() {
		System.out.println(Name);
		// System.out.println(timeday.date_time()+" "+getTemperature()+" 0C");
	}

	public void RelHum() {
		System.out.println("Relativ humidity = " + getRelative_Humidity() + "%");
	}

	public int getRelative_Humidity() {
		return Relative_Humidity;
	}

	public void setRelative_Humidity(int Relative_Humidity) {
		this.Relative_Humidity = Relative_Humidity;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getDay_Temperature() {
		return Day_Temperature;
	}

	public void setDay_Temperature(int day_temperature) {
		this.Day_Temperature = day_temperature;
	}

	public int getNight_Temperature() {
		return Night_Temperature;
	}

	public void setNight_Temperature(int night_temperature) {
		this.Night_Temperature = night_temperature;
	}

}
