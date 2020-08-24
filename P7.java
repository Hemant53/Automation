package practiseExamplesPackage;
import java.util.Scanner;
//ADD UPTO N NUMBER

public class P7 {
	public static void main(String[] args) {

		System.out.println("Enter total number of number");
		try (Scanner input = new Scanner(System.in)) {
			int number = input.nextInt();
			int temp = 0;
					for(int i =0; i<=number; i++)
					{
						temp = temp + i;
					}
					
					System.out.println("Result  : "+  temp);
		}
	}
}
