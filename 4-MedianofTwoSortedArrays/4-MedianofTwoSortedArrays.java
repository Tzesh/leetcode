class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] merged = new int[totalLength];
        for (int i = 0; i < nums1.length; i++)
            merged[i] = nums1[i];
        for (int i = 0; i < nums2.length; i++)
            merged[i + nums1.length] = nums2[i];
        quickSort(merged, 0, totalLength - 1);
        return totalLength % 2 == 1 ? merged[totalLength / 2]
                : (merged[totalLength / 2] + merged[(totalLength / 2) - 1]) / 2.0;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
