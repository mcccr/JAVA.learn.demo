import data.Subject;
import data.WeatherData;
import display.CurrentConditionsDisplay;

/**
 * Created by mcccr on 16-9-20.
 */
public class WeatherStation {
    public static void main (String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        weatherData.setMeasurements(75, 20, 30.4f);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        weatherData.setMeasurements(70, 15, 30.6f);
    }
}
