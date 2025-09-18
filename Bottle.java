class Bottle{

static byte  nos;
static short litres;
 static int prices;
 static long phnos;
 static char types;
 static boolean presents;
static float gsts;
static double reviews;
static String names;
public static byte no(){
nos=5	;
System.out.println("The no is:");
return nos;
}
public static short litre(){
litres=130;	
System.out.println("The litre is:");
return litres;
}
public static int price (){
	prices=100000;
System.out.println("The price is:");
return prices;
}
public static long phno(){
phnos=1234567896l;	
System.out.println("The phone number is");
return phnos;
}
public static char type(){
types='B';	
System.out.println("The Type is:");
return types;
}
public static boolean present(){
	presents=true;
System.out.println("Is it present?:");
return presents;
}
public static float gst(){
	gsts=12.56f;
System.out.println("The gst is:");
return gsts;
}
public static double review(){
reviews=25.6354;
System.out.println("The Review is:");
return reviews;
}
public static String name(){
names="PUMA";
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