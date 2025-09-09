class Blood{

public static byte litre(){
	System.out.println("The litre is..");
	return 2;
	
}
public static short require(){
	System.out.println("The Required is..");
	return 69;
	
}
public static int price(){
	System.out.println("The Price is ..");
	return 1258336;
	
}
public static long contact(){
	System.out.println("Please contact");
	return 1234567890l;
	
}
public static char type(){
	System.out.println("The type is..");
	return 'O';
}
public static float review(){
	System.out.println("The Review is");
	return 4.5f;
	
}
public static double gst(){
	System.out.println("The GST is..");
	return 18.5;
}
public static boolean isAvailable(){
	return true;
}
public static void main(String [] args){
	
	System.out.println(litre());
	System.out.println(require());
	System.out.println(price());
	System.out.println(contact());
	System.out.println(type());
	System.out.println(review());
	System.out.println(gst());
	System.out.println(isAvailable());
	
}
}