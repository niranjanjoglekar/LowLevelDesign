package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete subject
 */
public class StockPrice implements Subject{
    private List<Observer> observers;
    private double price;

    StockPrice(){
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers){
            observer.update(this);
        }
    }

    public void setPrice(double price){
        this.price = price;
        notifyObserver();
    }

    public double getPrice() {
        return price;
    }
}
