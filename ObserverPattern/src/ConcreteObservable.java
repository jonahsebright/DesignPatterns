import java.util.ArrayList;

public class ConcreteObservable implements Observable {

    private ArrayList<Observer> observers = new ArrayList<>();

    private Object data;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    public Object getState(){
        return data;
    }
}
