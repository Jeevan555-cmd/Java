class Pista{
int length;
String name;
double review;
boolean isAvailable;
float gst;


public Pista(){
System.out.println("It is a No parametr Constructor");

}
public Pista(int length){
System.out.println("It is a Single parameter Constructor ");
System.out.println("Name is"+length);
}
public Pista(double review, boolean isAvailable){
 System.out.println("It is 2 argument Constructor");
 System.out.println("The Review is"+review);
 System.out.println("Is is Available"+isAvailable);
	
}

public static void main(String [] args){

Pista obj=new Pista();
obj.length=10;
obj.name="Organic";
obj.review=8.5246;
obj.isAvailable=false;
System.out.println("The length is:"+obj.length);
System.out.println("The name is"+obj.name);
System.out.println("Review is:"+obj.review);
System.out.println("Is is Available:"+obj.isAvailable);

Pista obj1=new Pista(12535);
Pista obj2=new Pista(5.56844,true);

}

}