class Table{
byte size;
String name;
float review;
boolean isAvailable;
float gst;


public Table(){
System.out.println("It is a No parametr Constructor");

}
public Table(byte size){
System.out.println("It is a Single parameter Constructor ");
System.out.println("Name is"+size);
}
public Table(float review, boolean isAvailable){
 System.out.println("It is 2 argument Constructor");
 System.out.println("The Review is"+review);
 System.out.println("Is is Available"+isAvailable);
	
}

public static void main(String [] args){

Table obj=new Table();
obj.size=10;
obj.name="Wooden";
obj.review=4.999;
obj.isAvailable=false;
System.out.println("The size is:"+obj.length);
System.out.println("The name is"+obj.name);
System.out.println("Review is:"+obj.review);
System.out.println("Is is Available:"+obj.isAvailable);

Table obj1=new Table(12535);
Table obj2=new Table(4.9536,true);

}

}