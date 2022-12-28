import java.util.Scanner;
class fibo2 {
	static int fib(int n)
	{
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
            System.out.println("Enter value of N:");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.print(fib(i) + " ");
		}
	}
}
