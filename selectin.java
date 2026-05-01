import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        long start = System.nanoTime();
        
        for(int i = 0; i < n - 1; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
        long end = System.nanoTime();
        
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        System.out.println(end - start);
    }
}
