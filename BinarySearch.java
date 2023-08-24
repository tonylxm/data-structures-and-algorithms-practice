// DATE CREATED: 18/08/2023

import java.util.Arrays;

public class BinarySearch {
    // Searching for x
    public static int binarySearch(int A[], int x) {
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (x == A[mid]) return mid;
            else if (x > A[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;  // If x is not found in array
    }

    public static int binarySearchFirstIndex(int A[], int x) {
        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (x <= A[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (x == A[left]) return left;
        else return -1;
    }

        public static int binarySearchLastIndex(int A[], int x) {
        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            int mid = (int) Math.ceil(left + (right - left) / 2.0);
            if (x >= A[mid]) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        if (x == A[left]) return left;
        else return -1;
    }
    
    public static void main(String[] args) {
        int[] A = {2, 4, 4, 4, 4, 4, 9, 42, 73, 92};
        int target = 4;

        // sorted array containing 0-9 inclusive
        // for (int i = 0; i < A.length; i++) {
        //     A[i] = i;
        // }

        System.out.println(Arrays.toString(A));
        System.out.println("Target: " + target);
        System.out.println("Target index in array: " + binarySearch(A, target));
        System.out.println("Target's first index in array: " + binarySearchFirstIndex(A, target));
        System.out.println("Target's last index in array: " + binarySearchLastIndex(A, target));
    }
}