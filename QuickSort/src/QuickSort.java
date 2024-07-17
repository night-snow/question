import java.util.Arrays;

class Range {
    int start,end;
    Range() {
        this(0, 0);
    }
    Range(int s, int e) {
        start = s;
        end = e;
    }
}

public class QuickSort {
    // 快速排序
    public static  <T extends Comparable<T>> void quickSort(T[] arr, int len) {
        if (len <= 0) {
            return;
        }
        Range[] r = new Range[len];
        int p = 0;
        r[p++] = new Range(0, len - 1);

        while (p > 0) {
            Range range = r[--p];

            if (range.start >= range.end) {
                continue;
            }

            T mid = arr[range.end];
            int left = range.start;
            int right = range.end - 1;

            while (left < right) {
                while (left < right && arr[left].compareTo(mid) < 0) {
                    left++;
                }
                while (left < right && arr[right].compareTo(mid) >= 0) {
                    right--;
                }
                if (left < right) {
                    T temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
            }

            if (arr[left].compareTo(arr[range.end]) >= 0) {
                T temp = arr[left];
                arr[left] = arr[range.end];
                arr[range.end] = temp;
            } else {
                left++;
            }

            r[p++] = new Range(range.start, left - 1);
            r[p++] = new Range(left + 1, range.end);
        }
    }
}
