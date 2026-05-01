
import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0, high = n - 1;
        int mid;
        int pos = -1;

        long start = System.nanoTime();

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                pos = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long end = System.nanoTime();

        if (pos != -1) {
            System.out.println("Element found at position: " + (pos + 1)); 
        }else {
            System.out.println("Element not found");
        }

        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}
