class GreenTrafficSignal implements TrafficSignalType {
    @Override
    public void control() {
        System.out.println("Traffic Signal is Green. Go!");
    }
}
