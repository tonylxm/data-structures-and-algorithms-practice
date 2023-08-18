

public class BinarySearch {
    public int[] A = {4, 5, 34, 6, 2, 7, 4, 9};

    // Searching for x
    public static int binarySearch(int A[], int x) {
        int left = 1;
        int right = A.length -1;

        while (left <= right) {
            int k = (left + right) / 2;
            if (x == A[k]) return k;
            else if (x > A[k]) {
                left = k + 1;
            } else {
                right = k - 1;
            }
        }
        return -1;  // If x is not found in array
    }

    public static void main(String[] args) {
        int[] A = new int[10];  
        // array containing 0-9 inclusive
        for (int i=0; i<10; i++) {
            A[i] = i;
        }

        System.out.println(binarySearch(A, 3));
    }
}