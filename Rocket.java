class Rocket {
    public Rocket() {
        this("Falcon 9");
        System.out.println("It is a space Rocket");
    }

    public Rocket(String name) {
        this(2, 500000);
        System.out.println("Rocket name: " + name);
    }

    public Rocket(int stages, long thrust) {
        System.out.println("Stages: " + stages);
        System.out.println("Thrust power: " + thrust + " N");
    }
}


