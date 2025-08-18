class Captain{
public static void main (String [] args){
String captain[]={"MS Dhoni","Rohith","Virat Kohli","Shubman Gill","Smriti Mandana","Harmanpreet","Suryakumar yadav","Ruturaj Gaikwad","Kapil Dev","Gautam Gambhir"};

//Normal for loop
for(int i=captain.length-1;i>=0;i--){

System.out.println("The Indain Captains  are:"+captain[i]);
}

//for each loop
for(String leader:captain){
	System.out.println("The Indian Captaisn are:"+leader);
	
}
}
}