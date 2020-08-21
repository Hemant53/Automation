package practiseExamplesPackage;
//Greatest among 3 numbers
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		try (
		Scanner input = new Scanner(System.in)) {

			
			System.out.println("Numbers are: "+ a + " "+ b + " "+ c + " " );
			
			if(a>b && a>c)
			{
				System.out.println("Number A is largest number");
			}
			else if(b>a && b>c)
			{	System.out.println("Number B is largest number");
			}
			
			else
			{	System.out.println("Number c is largest number");
			
			}
		}
	}

}
