import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {12, 11, 13, 5, 6};
        QuickSort.quickSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}