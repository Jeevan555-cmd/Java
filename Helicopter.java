class Helicopter {
    public Helicopter() {
        this("AirRescue");
        System.out.println("It is a normal Helicopter");
    }

    public Helicopter(String name) {
        this(2, true);
        System.out.println("Helicopter name: " + name);
    }

    public Helicopter(int blades, boolean rescue) {
        System.out.println("Blades: " + blades);
        System.out.println("Rescue Mode: " + rescue);
    }
}


