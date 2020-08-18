import java.util.Scanner;
public class P3 {
	public static void main(String[] args) {
		double ustoSgDollar = 1.82;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter starting value: \n");
		int startingValue = sc.nextInt();
		System.out.println("Enter ending value: ");
		int endingValue = sc.nextInt();
		System.out.println("Enter Increment value: ");
		int incrementValue = sc.nextInt();
		
		System.out.println("\nUS$\t\tS$");
		System.out.println("--------------");
		for (int i=startingValue; i<=endingValue; i+=incrementValue) 
			System.out.printf("%d\t\t%.2f\n", i, i*ustoSgDollar);
		
		System.out.println("\nUS$\t\tS$");
		System.out.println("--------------");
		int i = startingValue;
		while(i<=endingValue)
		{
			System.out.printf("%d\t\t%.2f\n", i, i*ustoSgDollar);
			i+=incrementValue;
		}
		
		System.out.println("\nUS$\t\tS$");
		System.out.println("--------------");
		i = startingValue;
		do
		{
			System.out.printf("%d\t\t%.2f\n", i, i*ustoSgDollar);
			i+=incrementValue;
		}
		while(i<=endingValue);
	}
}
