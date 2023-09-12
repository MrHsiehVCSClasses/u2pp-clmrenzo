package u2pp;

import java.util.Scanner; //Allows you to use the Scanner objects

/**
 * YOUR COMMENTS HERE
 */

class Main {
  public static void main(String[] args) {
		
	    
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a fuel efficiency: ");
		double efficiency = Double.parseDouble(sc.nextLine());
		System.out.print("Enter a make: ");
		String make = sc.nextLine();
		System.out.print("Enter a model: ");
		String model = sc.nextLine();
		Car vroom = new Car(efficiency, make, model);
		System.out.print("Enter amount of gas to add: ");
		double gasToAdd = Double.parseDouble(sc.nextLine());
		vroom.addGas(gasToAdd);
		System.out.print("Enter distance to drive: ");
		double distanceToDrive = Double.parseDouble(sc.nextLine());
		vroom.drive(distanceToDrive);
		System.out.println("Your " + vroom.getMakeAndModel()
			+ " currently has " + vroom.getGasInTank() + " gallons of gas left in the tank");
		
		sc.close();
    
	  
		String word1 = "poop";
		int start1 = 1;
		int end1 = 3;
		String word2 = "fart";
		int start2 = 0;
		int end2 = 4;
		String result = wordChanger (word1, start1, end1, word2, start2, end2);
		System.out.println (result);
  }
  			
  /**
   * YOUR COMMENT HERE
   * @param word1 The first string to take a piece out of
   * @param start1 The starting index of the substring of word1
   * @param end1 The ending index of the substring of word1 (inclusive)
   * @param word2 The second string to take a piece out of
   * @param start2 The starting index of the substring of word2
   * @param end2 The ending index of the substring of word2 (inclusive)
   * @return YOUR COMMENT HERE
   */
  public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
			 String uno = word1.substring(start1, end1 + 1);
			 String dos = word2.substring(start2, end2 + 1);
			  

	  		return uno+dos;
  }
}