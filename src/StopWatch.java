import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		long timeElapsed ;
		
		//long finish =  System.currentTimeMillis() ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charecter : ");
		char ch = sc.next().toLowerCase().charAt(0) ;
		sc.close();
		
		
		// ...
		if (ch == 's')
		{
			long finish =  System.currentTimeMillis() ;
			
			timeElapsed = finish - start;
			
			System.out.println(timeElapsed);
		}
		//long finish = System.currentTimeMillis();
		
		
	}

}
