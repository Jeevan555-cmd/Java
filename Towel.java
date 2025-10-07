class Towel{
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

Towel obj1=new Towel();
obj1.no=127;
System.out.println("The number of Towel"+obj1.no);


Towel obj2=new Towel();
obj2.length=1234;
System.out.println("The Length of Towel"+obj2.length);

Towel obj3=new Towel();
obj3.price=9563247;
System.out.println("The Price of Towel"+obj3.price);


Towel obj4=new Towel();
obj4.phoneNo=1234567891l;
System.out.println("The PhoneNumber is"+obj4.phoneNo);

Towel obj5=new Towel();
obj5.type='T';
System.out.println("The Type opf Towel is"+obj5.type);

Towel obj6=new Towel();
obj6.gst=56.5f;
System.out.println("The gst of Towel is"+obj6.gst);

Towel obj7=new Towel();
obj7.review=4.26796;
System.out.println("The Review is"+obj7.review);

Towel obj8=new Towel();
obj8.present=true;
System.out.println("The Towel is present"+obj8.present);

Towel obj9=new Towel();
obj9.name=" Dior";
System.out.println("The name of Towel"+obj9.name);
}

}