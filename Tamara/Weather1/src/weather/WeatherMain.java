package weather;

public class WeatherMain {

	public static void main(String[] args) {
		// Weather h=new Weather();

		DateCalendar day = new DateCalendar();
		Weather h = new Weather();
		SunnyWeather S = new SunnyWeather();
		RainyWeather R = new RainyWeather();
		WindyWeather W = new WindyWeather();
		HailWeather  H = new HailWeather();
		day.GetTime();
		int Temp_Day = (int) ((S.getDay_Temperature() + R.getDay_Temperature()) / 2);
		int Temp_Night = (int) ((S.getNight_Temperature() + R
				.getNight_Temperature()) / 2);
		int Rel_Hum = (int) (R.getRelative_Humidity());
		
		System.out.println("Today is " + S.getName() + " and " + R.getName()
				+ " weather.");
		System.out.println("Temperature_midday= " + Temp_Day);
		System.out.println("Temperature_night= " + Temp_Night);
		System.out.println("Relative Humidity=" + Rel_Hum + "%");

	}

}
