class MobileCover {
    String name;
    int price;
    String color;
    float review;

 
    public MobileCover() {
        this("iPhone 15"); 
        System.out.println("No-arg constructor");
    }

    
    public MobileCover(String name) {
        this("Realme X", 750); 
        this.name = name;
        System.out.println("1-arg constructor");
		System.out.println("The name is:"+this.name);
    }

   
    public MobileCover(String name, int price) {
        this("iPhone 17 Pro", 2000, "Orange"); 
        this.name = name;
        this.price = price;
        System.out.println("2-arg constructor");
		System.out.println("The name is:"+this.name);
		System.out.println("The Price is:"+this.price);
    }

    
    public MobileCover(String name, int price, String color) {
        this("OnePlus 10R", 1500, "Black", 4.5f); 
        this.name = name;
        this.price = price;
        this.color = color;
        System.out.println("3-arg constructor");
		System.out.println("The name is:"+this.name);
		System.out.println("The Price is:"+this.price);
		System.out.println("The color is:"+this.color);
    }

   
    public MobileCover(String name, int price, String color, float review) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.review = review;
        System.out.println("4-arg constructor");
		System.out.println("The name is:"+this.name);
		System.out.println("The Price is:"+this.price);
		System.out.println("The color is:"+this.color);
		System.out.println("The review is:"+this.review);
    }
}
