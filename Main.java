class Main{
	public static void main(String[] args){
		
		PetDog pet=new PetDog();
		pet.eat();
		pet.bark();
		pet.play();
		
		Animals animal=new PetDog();
		animal.walk();
		
		Dogs dog=new PetDog();
		dog.walk();
		
		
		Laptops lap =new Laptops();
		lap.turnOn();
		lap.reboot();
		lap.fold();
		
		Device dev=new Computers();
		dev.off();
		
		Computers com=new Laptops();
		com.off();
		
		
		SportsBike sports=new SportsBike();
		sports.start();
		sports.wheels();
		sports.speed();
		
		Vehicle v=new Bike();
		v.fuel();
		
		Bike bike=new SportsBike();
		bike.fuel();
		
		
		College col=new College();
		col.basic();
		col.primary();
		col.secondary();
		
		Schools school=new College();
		school.books();
		
		Education edu=new Schools();
		edu.books();
		
		Team team=new Team();
		team.name();
		team.deptName();
		team.teamInfo();
		
		Company c =new Department();
		c.skill();
		
		Department dep=new Team();
		dep.skill();
	}
	
	     
}