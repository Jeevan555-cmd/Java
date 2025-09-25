class AsusTuff{
public static void controller(String name,int price){
System.out.println(name);
System.out.println(price);
}
public static void controller(int rtx,char type){
System.out.println(rtx);
System.out.println(type);

}
public static boolean controller(String user,double no,float gst){
System.out.println("The user name"+user+ "and lapNumber is:"+no+ "and its gst is:"+gst);	
return true;
}
public static void main(String[] args){
controller("Jeevan",5,5.05f);
}
}