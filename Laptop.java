class Laptop {

    String model;
    int price;
    String processor;
    float rating;

    public Laptop() {
        this("Asus", 60000);
        this.model = model;
        System.out.println("It is a No-args constructor");
    }

    public Laptop(String model) {
        this("HP", 55000, "i5", 4.6f);
        this.model = model;
        System.out.println("It is a 1-arg constructor");
        System.out.println("Model: " + this.model);
    }

    public Laptop(String model, int price) {
        
        this.model = model;
        this.price = price;
        System.out.println("It is a 2-args constructor");
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
    }

    public Laptop(String model, int price, String processor) {
        this("Lenovo");
        this.model = model;
        this.price = price;
        this.processor = processor;
        System.out.println("It is a 3-args constructor");
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
        System.out.println("Processor: " + this.processor);
    }

    public Laptop(String model, int price, String processor, float rating)
	{   this();
        this.model = model;
        this.price = price;
        this.processor = processor;
        this.rating = rating;
        System.out.println("It is a 4-args constructor");
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
        System.out.println("Processor: " + this.processor);
        System.out.println("Rating: " + this.rating);
    }
}
