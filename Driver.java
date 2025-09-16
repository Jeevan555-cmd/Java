class Driver{
static String bus="SOUMYA";
 static float timing=7.30f;
public static void name(){
System.out.println("The Name of the Bus is:"+bus);
ticket();
}

public static void ticket(){
int price=1050;
System.out.println("The price of ticket is:"+price);
place();
}
public static void place(){
String places="KUNDAPURA TO BANGLORE";
System.out.println("The Bus goes from:"+places);
time();
}

public static void time(){

System.out.println("The Timing is:"+timing);
reach();
}

public static void reach(){
int reachTime=8;
System.out.println("Bus Reches at:"+reachTime);
}
public static void main(String[]  args){
	name();
}
}