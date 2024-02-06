import java.util.Scanner;

public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract elements from head
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
        // If right child is larger than root
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // A utility function to print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver Program
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HeapSort ob = new HeapSort();

        System.out.println("Sa numra do te ket array?: ");
        int k = in.nextInt(); // Read the size of the array

        int[] arr = new int[k]; // Initialize the array with size k
        System.out.println("Shkruaj " + k + " numra te array: ");

        for (int i = 0; i < k; i++) {
            // reading array elements from the user
            arr[i] = in.nextInt();
        }

        int n = arr.length;
        ob.sort(arr);

        System.out.println("Sorted array is: ");
        printArray(arr);
    }
}