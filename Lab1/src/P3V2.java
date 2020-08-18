import java.util.Scanner;

public class P3V2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end, increment;
		
		try {
			System.out.print("Enter the starting value: ");
			start = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter the ending value: ");
			end = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter the increment: ");
			increment = Integer.parseInt(sc.nextLine());
	
		}catch(NumberFormatException e) {
			System.out.println("Only numbers allowed!");
			return;
		}
		
		if (increment <= 0 || end<start){
			System.out.println("Error input!");
		}else {
			
			// For loop
			System.out.println("US$         S$");
			System.out.println("--------------");
			for (int i=start; i<=end; i+=increment) 
				System.out.printf("%-11d %-4s\n", i, i*1.82);
			
			// While loop
			System.out.println();
			System.out.println("US$         S$");
			System.out.println("--------------");
			int i = start;
			while (i<=end) {
				System.out.printf("%-11d %-4s\n", i, i*1.82);
				i += increment;
			}
			
			// Do-while loop
			System.out.println();
			System.out.println("US$         S$");
			System.out.println("--------------");
			i = start;
			do{
				System.out.printf("%-11d %-4s\n", i, i*1.82);
				i += increment;
			}while(i<=end);
			
		}
	}
}
