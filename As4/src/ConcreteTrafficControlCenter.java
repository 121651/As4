class ConcreteTrafficControlCenter implements TrafficControlCenter {
    private String name;

    public ConcreteTrafficControlCenter(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received traffic update: " + message);
    }
}
