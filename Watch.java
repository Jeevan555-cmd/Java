class Watch {

    String brand;
    int price;
    String type;
    float review;

    public Watch() {
        this("Fastrack", 2500, "Digital", 4.4f);
        
        System.out.println("It is a No-args constructor");
    }

    public Watch(String brand) {
        this("Jacob &co", 20000000);
        this.brand = brand;
        System.out.println("It is a 1-arg constructor");
        System.out.println("Brand: " + this.brand);
    }

    public Watch(String brand, int price) {
        this("Titan", 1200000, "Analog");
        this.brand = brand;
        this.price = price;
        System.out.println("It is a 2-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
    }

    public Watch(String brand, int price, String type) {
        this();
        this.brand = brand;
        this.price = price;
        this.type = type;
        System.out.println("It is a 3-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Type: " + this.type);
    }

    public Watch(String brand, int price, String type, float review) {
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.review = review;
        System.out.println("It is a 4-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Type: " + this.type);
        System.out.println("Review: " + this.review);
    }
}
