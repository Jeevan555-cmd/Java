class Pan{
byte no;
short length;
int price ;
long phoneNo;
char type;
float gst;
double review;
boolean present;
String name;


public static void main(String[] args){

Pan obj1=new Pan();
obj1.no=127;
System.out.println("The number of Pan"+obj1.no);


Pan obj2=new Pan();
obj2.length=1234;
System.out.println("The Length of Pan"+obj2.length);

Pan obj3=new Pan();
obj3.price=9563247;
System.out.println("The Price of Pan"+obj3.price);


Pan obj4=new Pan();
obj4.phoneNo=1234567891l;
System.out.println("The PhoneNumber is"+obj4.phoneNo);

Pan obj5=new Pan();
obj5.type='T';
System.out.println("The Type opf Pan is"+obj5.type);

Pan obj6=new Pan();
obj6.gst=56.5f;
System.out.println("The gst of Pan is"+obj6.gst);

Pan obj7=new Pan();
obj7.review=4.26796;
System.out.println("The Review is"+obj7.review);

Pan obj8=new Pan();
obj8.present=true;
System.out.println("The Pan is present"+obj8.present);

Pan obj9=new Pan();
obj9.name=" Dior";
System.out.println("The name of Pan"+obj9.name);
}

}