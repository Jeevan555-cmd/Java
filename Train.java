class Train {
    public Train() {
        this("Rajdhani Express");
        System.out.println("It is a passenger Train");
    }

    public Train(String name) {
        this(120, 20);
        System.out.println("Train name: " + name);
    }

    public Train(int speed, int coaches) {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Number of coaches: " + coaches);
    }
}


