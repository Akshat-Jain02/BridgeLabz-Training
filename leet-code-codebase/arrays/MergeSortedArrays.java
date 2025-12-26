import java.util.*;

class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int piv = 0;
        int[] arr = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                arr[piv++] = nums1[i++];
            } else {
                arr[piv++] = nums2[j++];
            }
        }

        while (i < m) {
            arr[piv++] = nums1[i++];
        }

        while (j < n) {
            arr[piv++] = nums2[j++];
        }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = arr[k];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input m and n
        System.out.print("Enter number of elements in nums1 (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of elements in nums2 (n): ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        // Input nums1 (first m elements)
        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input nums2
        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Call static method
        merge(nums1, m, nums2, n);

        // Output merged array
        System.out.println("Merged array:");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }

        sc.close();
    }
}
