import java.util.Scanner;

public class FibonacciSeries {
	
	// fibonacci method declaration
	void fibonacci() {
		
		int a = 0 , b =1 ;
		int c , limit ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit of series : ");
		limit = sc.nextInt();
		sc.close();
		
		for(int i=1 ; i<limit ; i++)
		{
			c = a+b;
			System.out.println(c);
			a =b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		
		FibonacciSeries fib = new FibonacciSeries();
		fib.fibonacci();
		
	}
}
