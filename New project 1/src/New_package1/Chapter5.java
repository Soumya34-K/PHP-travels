package New_package1;

import java.util.Scanner;

public class Chapter5 {
	
	public static void main(String args[]) {
		
		int requiredsalary= 30000;
		int requiredcurrentjobexperience = 2;
		
		System.out.println("Employer salary is : ");
		Scanner scanner=new Scanner(System.in);
		double salary=scanner.nextDouble();
		
		System.out.println(" Employer experience is current job is : ");
		double experience=scanner.nextDouble();
		
		scanner.close();
		
		if(salary>=requiredsalary) {
			
		if (experience>=requiredcurrentjobexperience) {
			
			System.out.println("Congtrats your eligible for the loan");
			
		}
		else {
			
		System.out.println(" your are not  eligible for the loan as your work experice is " + experience);	
		}
		
		}
		
		else {
		System.out.println("your are not  eligible for the loan as your salary is " + salary );
	}

}
	
}
