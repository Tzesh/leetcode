class Solution {
    public int minSteps(String s, String t) {
        int[] first = calculate(s);
        int[] second = calculate(t);
        return calculateMinDifference(first, second);    
    }

    public int[] calculate(String s) {
        int[] arr = new int[29];

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';
            arr[val]++;
        }

        return arr;
    }

    public int calculateMinDifference(int[] first, int[] second) {
        int minDiff = 0;

        for (int i = 0; i < 29; i++) {
            int firstVal = first[i];
            int secondVal = second[i];
            int firstDiff = Math.abs(secondVal - firstVal);
            int secondDiff = Math.abs(firstVal - secondVal);
            minDiff += Math.min(firstDiff, secondDiff);
        }

        return minDiff / 2;
    }
}
