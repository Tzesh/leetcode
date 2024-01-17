        int left = low, right = mid + 1;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left++]);
            } else {
                temp.add(nums[right++]);


        ArrayList<Integer> temp = new ArrayList<>();
            }
            count += j - (mid + 1);
        }
        for (int i = low; i <= mid; i++) {
            while (j <= high && nums[i] > (2 * (long) nums[j])) {
                j++;
        int count = 0;
        int j = mid + 1;

class Solution {
    int merge(int[] nums, int low, int mid, int high) {
            }
        }

        while (left <= mid) {
            temp.add(nums[left++]);
        }

        while (right <= high) {
            temp.add(nums[right++]);
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }

        return count;
    }

    int mergeSort(int[] nums, int low, int high) {
        if (low >= high)
            return 0;
        
        int mid = (low + high) / 2;
