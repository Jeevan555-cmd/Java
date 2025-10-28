class DowncastRunner{
public static void main(String[] args) {
        Games g = new Cricket();
		g.player();
		g.start();
		if ( g instanceof Cricket){
        Cricket c = (Cricket) g;
        c.play();
		c.start();
		}
		else{
			System.out.println("It is not an instance..");
			
		}
		
		Devices d = new Mobilee(); 
        d.powerOn();
        d.powerOff();

        if (d instanceof Mobilee) {
            Mobilee m = (Mobilee) d; // Downcasting
            m.callFeature();
            m.powerOn(); 
        } else {
            System.out.println("It is not an instance of Mobile");
        }
		
		 Shape s = new Circle();
        s.draw();
        s.color();

        if (s instanceof Circle) {
            Circle c = (Circle) s;
            c.area();
            c.draw();
        } else {
            System.out.println("It is not an instance of Circle");
        }
		
		  Food f = new Pizzas();
        f.prepare();
        f.serve();

        if (f instanceof Pizzas) {
            Pizzas p = (Pizzas) f;
            p.addToppings();
            p.prepare();
        } else {
            System.out.println("It is not an instance of Pizza");
        }
		
		    Instrument i = new Guitar();
        i.tune();
        i.play();

        if (i instanceof Guitar) {
            Guitar guitar = (Guitar) i;
            guitar.pluckStrings();
            guitar.play();
        } else {
            System.out.println("It is not an instance of Guitar");
        }
		Appliance a = new WashingMachines();
        a.plugIn();
        a.turnOn();

        if (a instanceof WashingMachines) {
            WashingMachines wm = (WashingMachines) a;
            wm.rinse();
            wm.turnOn();
        } else {
            System.out.println("It is not an instance of WashingMachine");
        }
		 Books book = new Novel();
        book.open();
        book.read();

        if (book instanceof Novel) {
            Novel n = (Novel) book;
            n.plotTwist();
            n.read();
        } else {
            System.out.println("It is not an instance of Novel");
        }
		
		GameChess gc = new Chess();
        gc.player();
        gc.start();

        if (gc instanceof Chess) {
            Chess c = (Chess) gc;
            c.movePiece();
            c.start();
        } else {
            System.out.println("It is not an instance of Chess");
        }
    }
}