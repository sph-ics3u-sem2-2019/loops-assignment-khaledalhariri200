package problem1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read a value. Print out from 1 to the input
		Scanner in=new Scanner(System.in);
		int num1=in.nextInt();
		int counter=1;
		while (counter<=num1){
			System.out.println(counter);
			counter++;

		}
	}

}

