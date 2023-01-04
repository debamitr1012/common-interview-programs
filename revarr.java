import java.util.Scanner;
import java.util.Arrays;
class revarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");
	  int n = sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        { 
        array[i]=sc.nextInt();
        }
        System.out.println("Input Array :" + Arrays.toString(array));
        for(int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = j;
        }
        System.out.println("Reversed Array :" + Arrays.toString(array));
    }
}
