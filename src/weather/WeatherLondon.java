package weather;

public class WeatherLondon {
    public static void main(String[] args) {

        int date = 31;
        String month = "August";
        int year = 2022;
        int hours = 12;
        int min = 00;

        int temperature = 18;
        String city = "London, GB";
        int temperatureFeelsLike = 17;
        int humidity = 70;
        double visibility = 10;


        System.out.println(date + "/" + month + "/" + year + "\t" + hours + ":" + min + "0" );
        System.out.println(city);
        System.out.println("☁ " + temperature + " C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Visibility: " + visibility + " km");

        temperature = 15;
        temperatureFeelsLike = 13;

    }
}
