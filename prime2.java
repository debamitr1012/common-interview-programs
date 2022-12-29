import java.util.Scanner;   
class prime2 {
	static int i = 2;
	public static boolean isPrime(int n)
	{
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == i)
			return true;
		if (n % i == 0) {
			return false;
		}
		i++;
		return isPrime(n);
	}
	public static void main(String[] args)
	{
            Scanner sc = new Scanner(System.in);  
            System.out.print("Enter a number : ");  
            int n = sc.nextInt();  
		if (isPrime(n)) {
			System.out.println(n + " is a prime number");
		}
		else {
			System.out.println(n + " is not a prime number");
		}
	}
}
