class Tape{
	static boolean a;
public Tape(char type,double length,boolean available){
System.out.println("The Type of a Tape is :" +type);
System.out.println("Length of a Tape is :"+length);
System.out.println("Is it Avilable? " +available );
}
public static void main(String[] args){

a=false;
new Tape('C',1123456,a);
}
}