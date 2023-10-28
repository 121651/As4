class ConcreteTrafficSignalFactory implements TrafficSignalFactory {
    @Override
    public TrafficSignalType createTrafficSignal() {
        if (Math.random() < 0.5) {
            return new RedTrafficSignal();
        } else {
            return new GreenTrafficSignal();
        }
    }
}
