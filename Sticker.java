class Sticker{
static int prices;
public Sticker(){

System.out.println("This is a Explicit No args Constructor");
}
public Sticker(String type, int price){
price=prices;
System.out.println("This is a "+type+" Sticker");
System.out.println("Price of "+type+" Sticker  is :"+prices);
}

public static void main (String [] args){
new Sticker();
new Sticker("Animal",50);
}
}