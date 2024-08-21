import java.util.Scanner;
public class IT24101577Lab5Q1{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int num2 = input.nextInt();

		System.out.print("Enter the third integer: ");
		int num3 = input.nextInt();
		
		int largest = num1;
		int smallest = num1;

		if(num2>largest){

			largest = num2;

		
		}

		else if(num2<smallest){

			smallest = num2;


		}

		
		if(num3>largest){

			largest = num3;


		}

		else if(num3<smallest){

			smallest = num3;

		

		}

		System.out.println();
		System.out.print("User entered numbers are : ");
		System.out.println(num1 + " " + num2 + " " + num3);

		System.out.print("The Smallest number is: ");
		System.out.println(smallest);
		
		System.out.print("The Largest number is: ");
		System.out.println(largest);
		
		












	}






}