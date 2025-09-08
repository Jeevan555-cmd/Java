class Shop{
	public static void electro(){
		System.out.println(" First We  purchased many Electronics items in the Mall");
		clothes();
	}
	public static void clothes(){
			System.out.println("after tha wer  purchased many Clothes  in the Mall");
		furniture();
	}
	public static void furniture(){
		
		System.out.println("after that we purchased th Furniture item in the Mall");
		rations();
	}
	public static void rations(){
		
		System.out.println("Also we purchased some rations for the home");
		
	}
	public static void main(String [] args){
		electro();
		Price.money();
		
	}
	

}