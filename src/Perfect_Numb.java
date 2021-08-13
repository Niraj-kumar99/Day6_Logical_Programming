import java.util.Scanner;

public class Perfect_Numb {
	
	public static boolean isPerfect()
	{
		int number ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		sc.close();
		
		int sum = 0 ;
		
		// check if i is a factor ....
		for(int i =1 ; i<number ; i++)
		{
			if(number%i == 0)
			{
				sum = sum+i;
			}
			if(number == sum)
			{
				return true;
			}
		}
		
		return false ;
	}
	
	
	
	public static void main(String[] args) {
		
		boolean b = isPerfect();
		
		if(b)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");
				
	}
}
