class mergeSort1 {
    public static void display(int[] arr, int size)
    {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] a = {12, 8, 4, 14, 36, 64, 15, 72, 67, 84};
        int size = a.length;
        display(a, size);
        mergeSort(a, 0, size - 1);
        display(a, size);
    }
    static void mergeSort(int[] a, int left, int right)
    {
        int mid;
        if(left < right)
        {
            mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }
    static void merge(int[] a, int left, int mid, int right)
    {
        int i = left; 
        int j = mid + 1; 
        int index = left; 
        int[] temp = new int[10];
        while(i <= mid && j <= right) 
        {
            if(a[i] < a[j]) 
            { 
                temp[index] = a[i]; 
                i = i + 1; 
            } 
            else 
            { 
                temp[index] = a[j]; 
                j = j + 1; 
            } 
            index++; 
        } 
        if(i > mid)
        {
            while(j <= right) {
                temp[index] = a[j];
                index++;
                j++;
            }
        }
        else {
            while(i <= mid)
            {
                temp[index] = a[i];
                index++;
                i++;
            }
         }
        int p = left;
        while(p < index)
        {
            a[p] = temp[p];
            p++;
        }
    }
}