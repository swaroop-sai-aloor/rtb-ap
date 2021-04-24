import java.util.Arrays;
 
public class QuickSortMain {
 
    private static int array[];
 
    public static void table_capacity(int[] arr) {
 
        if (arr == null || arr.length == 0) {
            return;
        }
        array = arr;
        table_id(0, array.length-1);
    }
 
    private static void table_id(int left, int right) {
 
        int i = left;
        int j = right;
        // find pivot number, we will take it as mid
        int pivot = array[left+(right-left)/2];
 
        while (i <= j) {
            /**
             * In each iteration, we will increment left until we find element greater than pivot
             * We will decrement right until we find element less than pivot
             */
            while (array[i] < pivot) { i++; } while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (left < j)
            table_id(left, j);
        if (i < right)
            table_id(i, right);
    }
 
    private static void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 
    public static void main(String a[]){
        int[] input = {33,21,45,64,55,34,11,8,3,5,1};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(input));
        table_capacity(input);
        System.out.println("==================");
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(array));
 
    }
}
