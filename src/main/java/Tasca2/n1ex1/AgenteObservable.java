package Tasca2.n1ex1;

import java.util.ArrayList;
import java.util.List;

public class AgenteObservable implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);

        }
    }
    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
