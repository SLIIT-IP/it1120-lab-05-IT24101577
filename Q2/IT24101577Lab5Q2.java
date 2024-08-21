import java.util.Scanner;
public class IT24101577Lab5Q2{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of new members introduced: ");
		int newMembers = input.nextInt();

		if(newMembers<0){

			System.out.print("Input must be a number 0 or greater");
			System.out.println();

		}

		else{

			System.out.println();
		
			switch(newMembers){
	
			case 0:
				System.out.print("No Prize");
				System.out.println();
				break;

			case 1:
				System.out.print("Prize is a : Pen");
				System.out.println();
				break;
		
			case 2:
				System.out.print("Prize is a : Umbrella");
				System.out.println();
				break;

			case 3:
				System.out.print("Prize is a : Bag");
				System.out.println();
				break;

			case 4:
				System.out.print("Prize is a : Travelling Chair");
				System.out.println();
				break;

			case 5:
				System.out.print("Prize is a : Headphone");
				System.out.println();
				break;

			default:
				System.out.print("Prize is a : Headphone");
				System.out.println();
				break;
		

			}
		}


	
		




	

	}




}