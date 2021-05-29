package New_package1;

import java.util.Scanner;

public class Chapter3 {
	
	
	public static void main (String args[]) {
		
		int salary=1000;
		int bonus= 250;
		
		System.out.println("How many sales did the emploee of this week");
		Scanner scanner= new Scanner(System.in);
		int sales=scanner.nextInt();
		scanner.close();

		
		if(sales>10)
		{
			salary= salary + bonus;
			
		}
			System.out.println("The employee's pay is $ " + salary);
		
	}

}
