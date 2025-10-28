class Tractor {
    public Tractor() {
        this("John Deere");
        System.out.println("It is a standard Tractor");
    }

    public Tractor(String brand) {
        this(75, 450000);
        System.out.println("Tractor brand: " + brand);
    }

    public Tractor(int horsepower, double price) {
        System.out.println("Horsepower: " + horsepower + " HP");
        System.out.println("Price: ₹" + price);
    }
}


