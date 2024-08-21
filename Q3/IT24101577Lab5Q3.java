import java.util.Scanner;
public class IT24101577Lab5Q3{

	public static void main(String[] args){

		final double CHARGEPERDAY = 48000.00;
		final double DISCOUNT10 = 0.1;
		final double DISCOUNT20 = 0.2;

		double discountAmount = 0;
		double totalAfterDiscount = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Start Date (1-31): ");
		int startDate = input.nextInt();

		System.out.print("Enter End Date (1-31): ");
		int endDate = input.nextInt();

		if(startDate<1||startDate>31||endDate<1||endDate>31){
		
			System.out.print("Error: Days must be between 1 and 31");
			System.out.println();

		}
	
		else if(startDate>=endDate){

			System.out.print("Error: Start Date must be less than End Date");
			System.out.println();


		}

		else{
		
			int reservedDays = endDate - startDate;

			if(reservedDays<3){

				totalAfterDiscount = (CHARGEPERDAY*reservedDays)-discountAmount;
			

			}

			else if(reservedDays<=4){
				
				discountAmount = (CHARGEPERDAY*reservedDays)*DISCOUNT10;
				totalAfterDiscount = (CHARGEPERDAY*reservedDays)-discountAmount;
				



			}

			else if(reservedDays>=5){

				discountAmount = (CHARGEPERDAY*reservedDays)*DISCOUNT20;
				totalAfterDiscount = (CHARGEPERDAY*reservedDays)-discountAmount;


	
			}

			System.out.println();
			System.out.println("Room Charge Per Day: Rs. " + CHARGEPERDAY + "/=");
			System.out.println("Number of Days Reserved: " + reservedDays);
			System.out.println("Total Amount to be Paid: " + totalAfterDiscount);
			System.out.println();
			
			


			

			

			

			
			

			

			







		}

		

		









	}





}