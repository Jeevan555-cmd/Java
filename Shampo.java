class Shampo{
static byte weight=10;
static short price=200;
static int pieces=100000;
static  long  phone=1234567895l;
static float review=3.75f;

public static void product(){	
	
System.out.println("The weight of shampo is"+weight);
System.out.println("The price of Shampo is"+price);

System.out.println("The Number of pieces are"+pieces);

System.out.println("The Phone Number is"+phone);

System.out.println("The Review is"+review);
}

public static void main(String [] args){

String name ="The Brand is Dove";
boolean isPresent=true;
double gst=15.2356;
char type='D';

System.out.println(name);
product();
System.out.println("Is it Present"+isPresent);

System.out.println("The Gst is"+gst);

System.out.println("The type is"+type);



}
}