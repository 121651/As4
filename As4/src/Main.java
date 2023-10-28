public class Main {
    public static void main(String[] args) {
        TrafficSignalFactory signalFactory = new ConcreteTrafficSignalFactory();

        TrafficSignalType signal1 = signalFactory.createTrafficSignal();
        TrafficSignalType signal2 = signalFactory.createTrafficSignal();

        TrafficSignal trafficSignal = new ConcreteTrafficSignal();
        trafficSignal.addObserver(new ConcreteTrafficControlCenter("Control Center A"));
        trafficSignal.addObserver(new ConcreteTrafficControlCenter("Control Center B"));

        trafficSignal.reportTrafficConditions("Accident ahead. Signals changing!");

        signal1.control();
        signal2.control();
    }
}
