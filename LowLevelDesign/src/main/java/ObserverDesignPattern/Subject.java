package ObserverDesignPattern;

/**
 * Subject interface
 */
public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}
