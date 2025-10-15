class MainForInheritance{

public static void main(String[] args){
Animal a=new Animal();
a.eat();
a.makeSound();
Dog d=new Dog();
d.sleep();
d.move();

Person p=new Person();
p.speak();
p.eat();
Jeevan j=new Jeevan();
j.walk();
j.sleep();


Vehicles v=new Vehicles();
v.start();
v.stop();
Cars c=new Cars();
c.accelerate();
c.brake();

Employee emp=new Employee();
emp.work();
emp.takeBreak();
Manager man= new Manager();
man.getSalary();
man.attendMeeting();

Bird b=new Bird();
b.sleep();
b.eat();
Parrot parrot= new Parrot();
parrot.fly();
parrot.sing();

Gadget g =new Gadget();
g.on();
g.off();
Smartphone s=new Smartphone();
s.charge();
s.use();

Sport sport=new Sport();
sport.play();
sport.cheer();
Football f=new Football();
f.rest();
f.train();

Pet pet=new Pet();
pet.eat();
pet.sleep();
Cat cat =new Cat();
cat.play();
cat.makeSound();

Teacher teacher=new Teacher();
teacher.teach();
teacher.giveHomework();
MathTeacher m=new MathTeacher();
m.correctPapers();
m.takeAttendance();

Building build=new Building();
build.open();
build.close();
School school=new School();
school.lightOff();
school.lightOn();

Machine mac=new Machine();
mac.start();
mac.stop();
WashingMachine w=new WashingMachine();
w.repair();
w.run();

Doctor doctor= new Doctor();
doctor.diagnose();
doctor.check();
Nurse n=new Nurse();
n.treat();
n.help();

Aircraft air=new Aircraft();
air.fly();
air.land();
FighterJet jet=new FighterJet();
jet.takeOff();
jet.refuel();

Artist art=new Artist();
art.draw();
art.paint();
Painter painter=new Painter();
painter.rest();
painter.exhibit();

Chef chef= new Chef();
chef.cook();
chef.cleanKitchen();
PastryChef pchef=new PastryChef();
pchef.prepareIngredients();
pchef.serve();

Bicycle bike= new Bicycle();
bike.pedal();
bike.brake();
MountainBike mbike=new MountainBike();
mbike.ringBell();
mbike.park();

Game game=new Game();
game.start();
game.play();
ShootingGame sgame=new ShootingGame();
sgame.pause();
sgame.end();
}

}