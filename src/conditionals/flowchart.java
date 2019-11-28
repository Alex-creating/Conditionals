package conditionals;



public class flowchart {

	
	int number = 5000;
	
	if (number>2000) {
		System.out.println("A"); 
		if (number>6000) {
			System.out.println("C");
		else {
			System.out.println("B");
			if (number>4000) {
				System.out.println("D");
			}
			else {
				System.out.println("E"); 
			}
		}
		}
	}
	
	
	
	
	public static void main(String [] Args) {
}
	
}