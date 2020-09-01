package example;

public interface Observable<T>{
    void add(Observer<T> observer);
    void remove(Observer<T> observer);
    void notifyObservers();
}
