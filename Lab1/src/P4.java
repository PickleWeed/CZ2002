import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter height: \n");
		int height = sc.nextInt();
		if(height == 0)
			System.out.printf("Error Input!");
		for(int i=0;i<=height-1;i++)
		{
			int y=0;
			do
			{
				if((y+i)%2 == 0)//even
				{
					System.out.printf("AA");
				}
				else if((y+i)%2 == 1) //odd
					System.out.printf("BB");
				y++;
			}while(y<=i);
			System.out.printf("\n");
		}
		
	}
}
