class Kabaddi{
	public static String teamName(){
		System.out.println("The Team name is");
		return "BengaluruBulls";
	}
public static byte players(){
	System.out.println("The Players in Team..");
	return 7;
	
}
public static short require(){
	System.out.println("The Required is..");
	return 15;
	
}
public static int pricepool(){
	System.out.println("The Pricepool is ..");
	return 1025000;
	
}
public static long contact(){
	System.out.println("Please contact");
	return 1234567890l;
	
}
public static char type(){
	System.out.println("The type is..");
	return 'K';
}
public static float review(){
	System.out.println("The Review is");
	return 5.0f;
	
}
public static double gst(){
	System.out.println("The GST is..");
	return 18.5;
}
public static boolean isAvailable(){
	return true;
}

public static void main(String [] args){
	System.out.println(teamName());
	System.out.println(players());
	System.out.println(require());
	System.out.println(pricepool());
	System.out.println(contact());
	System.out.println(type());
	System.out.println(review());
	System.out.println(gst());
	System.out.println(isAvailable());
	
}}