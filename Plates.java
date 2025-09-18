class Plates{

public static byte no(){
 byte number=50	;
System.out.println("The number is:");
return number;
}
public static short litre(){
short ltr=150;	
System.out.println("The litre is:");
return ltr;
}
public static int price (){
int prc=100000;
System.out.println("The price is:");
return prc;
}
public static long phno(){
long phone=1234567896l;	
System.out.println("The phone number is");
return phone;
}
public static char type(){
char typ='B';	
System.out.println("The Type is:");
return typ;
}
public static boolean present(){
boolean prsnt=true;
System.out.println("Is it present?:");
return prsnt;
}
public static float gst(){
float	gsts=12.56f;
System.out.println("The gst is:");
return gsts;
}
public static double review(){
double reviews=25.6354;
System.out.println("The Review is:");
return reviews;
}
public static String name(){
String names="DIOR";
System.out.println("The Name of Bottle is");
return names;
}
public static void main(String[] args){
		
System.out.println(name());
System.out.println(no());
System.out.println(litre());
System.out.println(price());
System.out.println(phno());
System.out.println(type());
System.out.println(gst());

System.out.println(review());
System.out.println(present());	
	
}
}