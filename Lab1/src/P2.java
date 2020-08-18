import java.util.Scanner;


public class P2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter your salary: \n"); 
		int salary = sc.nextInt();
		System.out.printf("Enter your merit: \n"); 
		int merit = sc.nextInt();
		char grade = 'n';
		
		if((salary >= 500) && (salary <=649))
		{
			grade = 'C';
			if((salary >= 600) && (salary <=649))
			
			if(merit < 10){
				grade = 'C';
			}
				
			else
			{
				grade = 'B';
			}
			
		}
		else if((salary >= 600) && (salary <=799))
		{
			grade = 'B';
			if((salary >= 600) && (salary <=649))
			{
				if(merit < 10){
					grade = 'C';
				}
				
				else
				{
				grade = 'B';
				}
			}
			if((salary >= 700) && (salary <=799))
			{
				if(merit < 20){
					grade = 'B';
				}
					
				else
				{
					grade = 'A';
				}
			}
			
		}
		else if((salary >= 700) && (salary <=899))
		{
			grade = 'A';
			if((salary >= 700) && (salary <=799))
			{
				if(merit < 20){
					grade = 'B';
				}
					
				else
				{
					grade = 'A';
				}
			}
			
		}
		System.out.printf("salary : %d,  merit : %d - Grade %c", salary, merit, grade);
	}
}
