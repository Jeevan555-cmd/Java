class Shoes {
    String brand;
    int size;
    String color;
    float price;

    
    public Shoes() {
        this("Nike"); 
        System.out.println("No-arg constructor");
    }

    
    public Shoes(String brand) {
        this("Puma", 9); 
        this.brand = brand;
        System.out.println("1-arg constructor");
        System.out.println("Brand: " + this.brand);
    }


    public Shoes(String brand, int size) {
        this("Adidas", 8, "Black"); 
        this.brand = brand;
        this.size = size;
        System.out.println("2-arg constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Size: " + this.size);
    }


    public Shoes(String brand, int size, String color) {
        this("Skechers", 7, "White", 4999.99f); 
        this.brand = brand;
        this.size = size;
        this.color = color;
        System.out.println("3-arg constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Size: " + this.size);
        System.out.println("Color: " + this.color);
    }

  
    public Shoes(String brand, int size, String color, float price) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
        System.out.println("4-arg constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Size: " + this.size);
        System.out.println("Color: " + this.color);
        System.out.println("Price: ₹" + this.price);
    }
}
