package display;

import data.Subject;

/**
 * Created by mcccr on 16-9-20.
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer{
    private float temp;
    private float hum;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current Conditions: " + temp + "E degrees and " + hum
         + "% humidity");
    }

    public void update(float temp, float hum, float pres) {
        this.temp = temp;
        this.hum = hum;
        display();
    }
}
