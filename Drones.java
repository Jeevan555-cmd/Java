class Drones {
    public Drones() {
        this("DJI Phantom");
        System.out.println("It is a general-purpose Drone");
    }

    public Drones(String model) {
        this(50, 1200.5f);
        System.out.println("Drone model: " + model);
    }

    public Drones(int range, float weight) {
        System.out.println("Operating range: " + range + " km");
        System.out.println("Drone weight: " + weight + " g");
    }
}


