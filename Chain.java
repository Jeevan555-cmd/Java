class Chain{
public static void name(String company){
System.out.println("The name of the Brand is:"+company);
}
public static void weight(float grams){
System.out.println("The weight of Chain is"+grams);
}
public static void money(int price){
System.out.println("The price of the Chain is:"+price);
}
public static void alphabet(char type){
System.out.println("The Chain name is"+type);

}
public static void gold(boolean waranty){
System.out.println("Is that chain is Gold:"+waranty);
}
public static void main(String []args){
name("Louis Vuiton");
weight(125.65f);
money(9000000);
alphabet('J');
gold(true);
}

}