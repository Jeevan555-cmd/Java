class DowncastRunner2 {
    public static void main(String[] args) {
        Employe e = new Developer();
        e.work();
        e.attendMeeting();

        if (e instanceof Developer) {
            Developer d = (Developer) e;
            d.code();
            d.attendMeeting();
        } else {
            System.out.println("Not an instance of Developer");
        }
		
		
		
		Persons p = new Student();
        p.speak();
        p.work();

        if (p instanceof Student) {
            Student s = (Student) p;
            s.attendClass();
            s.work();
        } else {
            System.out.println("Not an instance of Student");
        }
		
		
		Account a = new SavingsAccount();
        a.open();
        a.details();

        if (a instanceof SavingsAccount) {
            SavingsAccount sa = (SavingsAccount) a;
            sa.deposit();
            sa.details();
        } else {
            System.out.println("Not an instance of SavingsAccount");
        }
		
		
		Engineer ee = new SoftwareEngineer();
        ee.design();
        ee.report();

        if (ee instanceof SoftwareEngineer) {
            SoftwareEngineer se = (SoftwareEngineer) ee;
            se.debug();
            se.report();
        } else {
            System.out.println("Not an instance of SoftwareEngineer");
        }
		
		
		Gadgets gg = new Smartphones();
        gg.powerOn();
        gg.use();

        if (gg instanceof Smartphones) {
            Smartphones ss = (Smartphones) gg;
            ss.takePhoto();
            ss.use();
        } else {
            System.out.println("Not an instance of Smartphone");
        }
		
		
		
		Transport t = new Truck();  
        t.start();
        t.stop();

        if (t instanceof Truck) {
            Truck tr = (Truck) t;   
            tr.loadGoods();
            tr.start();
        } else {
            System.out.println("Not an instance of Truck");
        }
    }
}