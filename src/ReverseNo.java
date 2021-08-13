import java.util.Scanner;

public class ReverseNo {
	
	void reverse()
	{
		int number ;
		int reminder , reverse = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = sc.nextInt();
		sc.close();
		
		while (number != 0)
		{
			reminder = number % 10;
			reverse = reverse * 10 + reminder ;
			number = number / 10 ;
		}
		System.out.println(reverse);
	}
	
	
	public static void main(String[] args) {
		
		ReverseNo revNo = new ReverseNo();
	
		revNo.reverse();
	}

}
