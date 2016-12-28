package data;

import display.Observer;

/**
 * Created by mcccr on 16-9-20.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
