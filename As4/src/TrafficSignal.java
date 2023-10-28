import java.util.List;

interface TrafficSignal {
    void addObserver(TrafficControlCenter observer);
    void removeObserver(TrafficControlCenter observer);
    void notifyObservers(String message);
    void reportTrafficConditions(String message);
}
