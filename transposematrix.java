import java.util.Scanner;
class transposematrix {
	static int N;
      static int M;
	static void transpose(int A[][])
	{
		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < M; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
	}
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
	  N = sc.nextInt();
        System.out.println("Enter value of M:");
	  M = sc.nextInt();
        int A[][]=new int[N][M];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<N;i++){
        for (int j=0;j<M;j++){ 
        A[i][j]=sc.nextInt();
        }}
		transpose(A);
		System.out.print("Modified matrix is \n");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				System.out.print(A[i][j] + " ");
			System.out.print("\n");
		}
	}
}
