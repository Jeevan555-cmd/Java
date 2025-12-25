class Headphones{
public static void on(String company){
System.out.println("The name of the Brand is:"+company);
}
public static void sound(float dbz){
System.out.println("The DB of the sound is"+dbz);
}
public static void money(int price){
System.out.println("The price of the Headphone is:"+price);
}
public static void feature(char type){
System.out.println("The headphone Type is"+type);

}
public static void present(boolean waranty){
System.out.println("Is Headphone has a Waranty of 1 Year:"+waranty);
}
public static void main(String []args){
on("NOISE");
sound(10.50f);
money(5000);
feature('C');
present(true);
}

}