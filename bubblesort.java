import java.util.Scanner;
class bubblesort
{
    static void bubbleSort(int arr[])
    {
        int len = arr.length; 
        for (int i = 0; i < len-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < len - i - 1; j++) 
            { 
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
    }
    static void printArray(int arr[])
    {
        int len = arr.length;
        for (int i = 0; i < len; i++)
            System.out.print(arr[i] + " "); 
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");
	  int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        { 
        arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("Sorted array");
        printArray(arr); 
    }
}