package example;

import java.util.ArrayList;

public class WeatherStation implements Observable<Integer> {

    private ArrayList<Observer<Integer>> observers = new ArrayList<>();

    private int temperature = 20;

    @Override
    public void add(Observer<Integer> observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer<Integer> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer<Integer> observer : observers) {
            observer.update(getTemperature());
        }
    }

    public int getTemperature(){
        return temperature;
    }
}
