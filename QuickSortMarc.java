
public class QuickSortMarc  
{
    private int[] numbers;
    private int number;
    private int y = 0;
    public void sort(int[] values) 
    {
        // check for empty or null array
        if (values ==null || values.length==0)
        {
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) 
    {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) 
        {
            // If current value left of pivot is less than pivot
            while (numbers[i] < pivot) 
            {
            	// get value to right of that value as new current value
                i++;
            }
            // If current value right of pivot is more than pivot
            while (numbers[j] > pivot) 
            {
            	// get value to left of that value as new current value
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            if (i <= j) 
            {
                exchange(i, j);
                System.out.print("Step " + y + ": ");
                for(int z = 0; z < numbers.length; z++)
                {
                	System.out.print(numbers[z] + " ");
                }
                System.out.println();
                // increment i and decrement j to not include the newly swapped elements in next interation
                i++;
                j--;
                y++;
            }
        }
        // Recursion
        // if there is more sorting to be done on the left side
        if (low < j)
            quicksort(low, j);
        // if there is more sorting to be done on the right side
        if (i < high)
            quicksort(i, high);
    }

    // literally just the classic swap
    private void exchange(int i, int j) 
    {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    
    public static void main(String[] args)
    {
    	QuickSortMarc qs = new QuickSortMarc();
    	int[] arr = {7, 6, 5, 8, 4, 3, 2};//{6,3,8,2,4,1,7};
    	System.out.println("Original");
    	for(int i = 0; i < arr.length; i++)
    	{
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println("\nDuring Sort");
    	qs.sort(arr);
    	System.out.println("Sorted");
    	for(int i = 0; i < arr.length; i++)
    	{
    		System.out.print(arr[i] + " ");
    	}
    }
}