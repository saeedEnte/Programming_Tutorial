import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("Please input a number:");
		Scanner scan = new Scanner(System.in);
		int desNum = scan.nextInt();
		
		for (int i = 0; i < desNum; i++) {
			if (i==desNum) {
				break;
			} else {
				if (i%2 != 0) {
					System.out.println(i);
				}
			}
		}
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}
	
}
