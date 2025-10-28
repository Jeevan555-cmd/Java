class Titanic{

public Titanic(){
	this("MayFlower");
System.out.println("It is A Titanic Ship");
}
public Titanic(String name){
	this(10050,35l);
System.out.println("The name of the Titanic is:"+name);

}
public Titanic(int fuel ,long Passengers){
 System.out.println("The no of litre Fuel required is:"+fuel);
 System.out.println("No of Passengers are in the Ship is:"+Passengers);
}
}