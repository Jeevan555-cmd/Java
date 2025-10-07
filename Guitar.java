class Guitar{
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

Guitar obj1=new Guitar();
obj1.no=127;
System.out.println("The number of Guitar"+obj1.no);


Guitar obj2=new Guitar();
obj2.length=1234;
System.out.println("The Length of Guitar"+obj2.length);

Guitar obj3=new Guitar();
obj3.price=9563247;
System.out.println("The Price of Guitar"+obj3.price);


Guitar obj4=new Guitar();
obj4.phoneNo=1234567891l;
System.out.println("The PhoneNumber is"+obj4.phoneNo);

Guitar obj5=new Guitar();
obj5.type='T';
System.out.println("The Type opf Guitar is"+obj5.type);

Guitar obj6=new Guitar();
obj6.gst=56.5f;
System.out.println("The gst of Guitar is"+obj6.gst);

Guitar obj7=new Guitar();
obj7.review=4.26796;
System.out.println("The Review is"+obj7.review);

Guitar obj8=new Guitar();
obj8.present=true;
System.out.println("The Guitar is present"+obj8.present);

Guitar obj9=new Guitar();
obj9.name=" Dior";
System.out.println("The name of Guitar"+obj9.name);
}

}