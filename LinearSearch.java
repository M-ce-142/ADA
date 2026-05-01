import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        long start = System.nanoTime();

        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }

        long end = System.nanoTime();

        if (pos != -1)
            System.out.println("Element found at position: " + (pos + 1));
        else
            System.out.println("Element not found");

        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}
