class WashingMachine extends Machine {
	
	public static void repair() { 
	 System.out.println("It is run time Polymorphism");
	System.out.println( "Machine is under repair."); }
    void run() {
	System.out.println("Machine is running."); }
}