public class Binarysearch {
    // Returns index of x if it is present
    // in arr[], else return -1
    int table_id(int arr[], int x)
    {
  
        int l = 0, r = arr.length - 1;
  
        // Iterate until l <= r
        while (l <= r) {
            int m = l + (r - l) / 2;
  
            // Check if x is at mid
            if (arr[m] == x)
                return m;
  
            // If x greater than arr[m]
            // then ignore left half
            if (arr[m] < x)
                l = m + 1;
  
            // If x is smaller than arr[m]
            // ignore right half
            else
                r = m - 1;
        }
  
        // If we reach here, then element
        // was not present
        return -1;
    }
  
    // Driver Code
    public static void main(String args[])
    {
  
        // Create object of this class
        Binarysearch ob = new Binarysearch();
  
        // Given array arr[]
        int arr[] = { 2, 3, 4, 10, 40 };
     
        int x = 10;
  
        // Function Call
        int result = ob.table_id(arr, x);
  
        if (result == -1)
            System.out.println("Table not present");
        else
            System.out.println("table found at index "
                               + result);
    }
}
