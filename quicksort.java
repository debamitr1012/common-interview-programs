import java.util.Scanner;
class quicksort {
    public static void display(int[] arr, int size)
    {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");
	  int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        { 
        a[i]=sc.nextInt();
        }
        int size = a.length;
        display(a, size);
        quickSort(a, 0, size - 1);
        display(a, size);
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int indexPI  = partition(arr, low, high);
            quickSort(arr, low, indexPI  - 1);  
            quickSort(arr, indexPI  + 1, high); 
        }
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int swapIndex  = (low - 1);   
        for (int j = low; j <= high- 1; j++)
        {
            if (arr[j] < pivot)
            {
                swapIndex++;    
                swap(arr, swapIndex, j);
            }
        }
        swap(arr, swapIndex + 1, high);
        return (swapIndex + 1);
    }
}