package New_package1;

import java.util.Scanner;

public class Chapter4 {
	
	public static void main (String args[]) {
		
		int quota=10;
		
		System.out.println("Enter number of sales made this week");
		Scanner scanner=new Scanner(System.in);
		int sales=scanner.nextInt();
		scanner.close();
		
		if(sales>=quota) {
			
			System.out.println("Congrats you met your quota");
		}
		else {
			
			int saleShort=quota - sales;
			
			System.out.println("You did not met you quota you are " + saleShort +  " sale short");
		}
			
				
	}

}
