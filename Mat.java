class Mat{
int length;
String name;
double review;
boolean isAvailable;
float gst;


public Mat(){
System.out.println("It is a No parametr Constructor");
}
public Mat(int length){
System.out.println("It is a Single parameter Constructor ");
System.out.println("Name is"+length);
}
public Mat(double review, boolean isAvailable){
 
 System.out.println("The Review is"+review);
 System.out.println("Is is Available"+isAvailable);
	
}

public static void main(String [] args){

Mat obj=new Mat();

Mat obj1=new Mat(12535);
Mat obj2=new Mat(5.56844,true);

}

}