class Tissue{
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

Tissue obj1=new Tissue();
obj1.no=127;
System.out.println("The number of Tissue"+obj1.no);


Tissue obj2=new Tissue();
obj2.length=1234;
System.out.println("The Length of Tissue"+obj2.length);

Tissue obj3=new Tissue();
obj3.price=9563247;
System.out.println("The Price of Tissue"+obj3.price);


Tissue obj4=new Tissue();
obj4.phoneNo=1234567891l;
System.out.println("The PhoneNumber is"+obj4.phoneNo);

Tissue obj5=new Tissue();
obj5.type='T';
System.out.println("The Type opf Tissue is"+obj5.type);

Tissue obj6=new Tissue();
obj6.gst=56.5f;
System.out.println("The gst of Tissue is"+obj6.gst);

Tissue obj7=new Tissue();
obj7.review=4.26796;
System.out.println("The Review is"+obj7.review);

Tissue obj8=new Tissue();
obj8.present=true;
System.out.println("The Tissue is present"+obj8.present);

Tissue obj9=new Tissue();
obj9.name=" Softy";
System.out.println("The name of Tissue"+obj9.name);
}

}