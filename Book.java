class Book {

    String title;
    int price;
    String author;
    float rating;

    public Book() {
        this("Harry Potter");
        this.title = title;
        System.out.println("It is a No args Constructor");
    }

    public Book(String title) {
        this("The Alchemist", 500, "Paulo Coelho", 4.8f);
        this.title = title;
        System.out.println("It is a 1 args constructor");
        System.out.println("The title of the book is " + title);
    }

    public Book(String title, int price) {
        this();
        this.title = title;
        this.price = price;
        System.out.println("It is a 2 args constructor");
        System.out.println("The title of the book is " + this.title);
        System.out.println("The price of the book is " + this.price);
    }

    public Book(String title, int price, String author) {
        this("The Secret", 350);
        this.title = title;
        this.price = price;
        this.author = author;
        System.out.println("It is a 3 args constructor");
        System.out.println("The title of the book is " + this.title);
        System.out.println("The price of the book is " + this.price);
        System.out.println("The author of the book is " + this.author);
    }

    public Book(String title, String author, float rating) {
        this.title = title;
        this.author = author;
        this.rating = rating;
        System.out.println("It is a 3 args  constructor");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Rating: " + this.rating);
    }

    public Book(String title, int price, String author, float rating) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.rating = rating;
        System.out.println("It is a 4 args constructor");
        System.out.println("Title: " + this.title);
        System.out.println("Price: " + this.price);
        System.out.println("Author: " + this.author);
        System.out.println("Rating: " + this.rating);
    }
}
