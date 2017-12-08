
public class ArrayMethods4 {

	public static void main(String[]args)
	{
		int[] list1 = {1,5,0,6,2,3,0};
		 quickSort(list1,0,list1.length-1);
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
	public static void customSort()
	{
		
	}
}


