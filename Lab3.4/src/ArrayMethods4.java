
public class ArrayMethods4 {

	public static void main(String[]args)
	{
		int[] list1 = {1,5,0,6,2,3,0};
		customSort(list1);
		printarr(list1);
		
	}
	public static void printarr(int[]list1)
	{
		for(int i = 0;i<list1.length;i++)
		{
			System.out.print(list1[i] + " ");
		}
	}
	public static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
        
        
    }
	public static int partition(int arr[], int low, int high)
	    {
	        int pivot = arr[high]; 
	        int i = (low-1); // index of smaller element
	        for (int j=low; j<high; j++)
	        {
	            // If current element is smaller than or
	            // equal to pivot
	            if (arr[j] <= pivot)
	            {
	                i++;
	 
	                // swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	 
	        // swap arr[i+1] and arr[high] (or pivot)
	        int temp = arr[i+1];
	        arr[i+1] = arr[high];
	        arr[high] = temp;
	 
	        return i+1;
	    }
	/*It is a shell sort
	 * i sea it works 
	 * we shell test it :3 */

	public static void customSort(int[] arr)
	{
		int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {    
            for (int i = gap; i < n; i += 1)
            {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
 
                arr[j] = temp;
            }
        }
	}
}


