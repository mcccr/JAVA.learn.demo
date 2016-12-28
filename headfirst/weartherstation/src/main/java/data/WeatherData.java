package data;

import display.Observer;

import java.util.ArrayList;

/**
 * Created by mcccr on 16-9-20.
 */
public class WeatherData implements Subject{
    private float temp;
    private float hum;
    private float pres;
    private ArrayList obervers;

    public WeatherData() {
        obervers = new ArrayList();
    }

    public float getTemp() {
        return temp;
    }

    public float getHum() {
        return hum;
    }

    public float getPres() {
        return pres;
    }

    public void measurementsChanged() {

    }

    public void registerObserver(Observer o) {
        obervers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = obervers.indexOf(o);
        if (i >= 0) {
            obervers.remove(o);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < obervers.size(); i ++) {
            Observer observer = (Observer)obervers.get(i);
            observer.update(temp, hum, pres);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float hum, float pres) {
        this.temp = temp;
        this.hum = hum;
        this.pres = pres;
        measurementChanged();
    }
}
