import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 6, 6};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        if (smax == Integer.MIN_VALUE) {
            System.out.print("Second largest element not found");
        } else {
            System.out.print("Second largest element is: " + smax);
        }
    }
}
