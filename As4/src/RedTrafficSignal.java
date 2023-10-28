class RedTrafficSignal implements TrafficSignalType {
    @Override
    public void control() {
        System.out.println("Traffic Signal is Red. Stop!");
    }
}
