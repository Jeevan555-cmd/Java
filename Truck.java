class Truck{
public static void owner(String company,int price){
System.out.println(company);
System.out.println(price);
}
public static void owner(int speed){
System.out.println(speed);

}
public static char controller(double no,float gst){	
System.out.println(no);
System.out.println(gst);
return 'T';
}
public static void main(String[] args){
owner(150);
}
}