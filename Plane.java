class Plane {
    public Plane() {
        this("Boeing");
        System.out.println("This is a commercial Plane");
    }

    public Plane(String model) {
        this(800, 250);
        System.out.println("Plane model is: " + model);
    }

    public Plane(int speed, int passengers) {
        System.out.println("Speed of the Plane: " + speed + " km/h");
        System.out.println("Passenger capacity: " + passengers);
    }
}


