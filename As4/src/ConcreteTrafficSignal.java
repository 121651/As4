import java.util.ArrayList;
import java.util.List;

class ConcreteTrafficSignal implements TrafficSignal {
    private List<TrafficControlCenter> observers = new ArrayList<>();

    @Override
    public void addObserver(TrafficControlCenter observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TrafficControlCenter observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (TrafficControlCenter observer : observers) {
            observer.update(message);
        }
    }

    public void reportTrafficConditions(String message) {
        System.out.println("Traffic Signal: " + message);
        notifyObservers(message);
    }
}
