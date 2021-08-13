import java.util.Scanner;

public class Prime {
	
	public static boolean isPrime()
	{
		int number , count = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		sc.close();
		
		// starts from 2 because all numbers are div by 1 and less because number is always div by itself ...
		for(int i=2 ; i<number ; i++)
		{
			if(number%i == 0)
				count = count+1;
			
			if(count == 0)
			{
				return true;
			}

		}
		return false;
	}
	
	public static void main(String[] args) {
		
		boolean b = isPrime();
		
		if(b)
			System.out.println("PRIME NUMBER");
		else
			System.out.println("NOT PRIME");
	}
}
