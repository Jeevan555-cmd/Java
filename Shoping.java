class Shoping{

public static void ready(){
System.out.println("I get ready for the shoping with my freind");
booking();
}
public static void booking(){
System.out.println("We booking a Cab for the city");
entry();
}
public static void entry(){
System.out.println("We entered the Mall and searched for the Shop and Went inside  and We saw many dresses ");
payment();
Shop.dresses();
}
public static void payment(){
	System.out.println("After purchasing the Dresses we booked a cab again  and went to home");
	room();
}
public static void room(){
	System.out.println("after comming to room we unpacked and checked it again");
	
}
public static void main (String [] args){
	
	ready();
}
}