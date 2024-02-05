import java.util.*;

public class BinarySearch {
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x); // Corrected the bounds here

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinarySearch ob = new BinarySearch();

        System.out.println("Shkruaj numrin e elementeve ne varg: ");
        int k = in.nextInt(); // Read the size of the array

        int[] arr = new int[k]; // Initialize the array with size k
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < k; i++) {
            // reading array elements from the user
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr); // Sort the array before performing binary search

        System.out.println("Shkruaj elementin per te kerkuar: ");
        int x = in.nextInt(); // Read the element to search for
        int result = ob.binarySearch(arr, 0, k - 1, x); // Use k instead of arr.length to ensure consistency

        if (result == -1)
            System.out.println("Elementi nuk ekziston");
        else
            System.out.println("Elementi u gjet ne indexin: " + result);
    }
}
