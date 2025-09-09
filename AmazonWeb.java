class AmazonWeb{
public static void book(){
System.out.println("I bought 10 books");
prices.bookprice();
pencil();
}
public static void pencil(){
System.out.println("I bought 5 pencil");
prices.pencilprice();
laptop();
}

public static void laptop(){
System.out.println("I bought 1 Laptop");
prices.laptopprice();
mobile();
}
public static void mobile(){
System.out.println("I bought 2 Iphone");
prices.mobileprice();
tv();
}
public static void tv(){
System.out.println(" I bought one TV");
prices.tvprice();
}
public static void main(String[] args){
	book();
	
}
}