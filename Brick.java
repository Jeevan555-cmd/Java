class Brick{
int price;
String name;
long phoneNo;
boolean isAvailable;
float gst;


public Brick(){
System.out.println("It is a No parametr Constructor");
}
public Brick(String name){
System.out.println("It is a Single parameter Constructor ");
System.out.println("Name is"+name);
}
public Brick(long phoneNo,float gst){
 
 System.out.println("The Phone Number is"+phoneNo);
 System.out.println("The gst is"+gst);
	
}

public static void main(String [] args){

Brick obj=new Brick();

Brick obj1=new Brick("Mud");
Brick obj2=new Brick(1234567894l,10.56f);

}

}