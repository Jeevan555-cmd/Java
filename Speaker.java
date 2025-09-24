class Speaker{
public static void brand(String company){
System.out.println("The name of the Brand is:"+company);
}
public static void model(long no){
System.out.println("The model number is"+no);
}
public static void money(int price){
System.out.println("The price of the Speaker is:"+price);
}
public static void feature(double range){
System.out.println("The Speaker Range is"+range);

}
public static void present(boolean waranty){
System.out.println("Is that speaker contains all the accessories:"+waranty);
}
public static void main(String []args){
brand("ZEBRONICS");
model(1234567895l);
money(750000);
feature(256.125);
present(true);
}
}

