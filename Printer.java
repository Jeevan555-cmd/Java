class Printer{
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

Printer obj1=new Printer();
obj1.no=127;
System.out.println("The number is"+obj1.no);


Printer obj2=new Printer();
obj2.length=1234;
System.out.println("The Length is"+obj2.length);

Printer obj3=new Printer();
obj3.price=9532455;
System.out.println("The Price is"+obj3.price);


Printer obj4=new Printer();
obj4.phoneNo=1234567891l;
System.out.println("The PhoneNumber uis"+obj4.phoneNo);

Printer obj5=new Printer();
obj5.type='P';
System.out.println("The Type opf Printer is"+obj5.type);

Printer obj6=new Printer();
obj6.gst=56.5f;
System.out.println("The gst of Printer is"+obj6.gst);

Printer obj7=new Printer();
obj7.review=4.26796;
System.out.println("The Review is"+obj7.review);

Printer obj8=new Printer();
obj8.present=true;
System.out.println("The Printer is present"+obj8.present);

Printer obj9=new Printer();
obj9.name="Canon";
System.out.println("The name is"+obj9.name);
}

}