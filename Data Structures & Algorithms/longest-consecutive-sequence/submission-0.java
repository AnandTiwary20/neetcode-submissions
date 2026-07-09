class Solution {
    public int longestConsecutive(int[] nums) {
        // int min = nums[0];

        // int len = 0;

        // int []arr= new int[n];

        if(nums.length == 0) return 0;

        HashSet<Integer> mp = new HashSet<>();

        for (int num : nums) {
            mp.add(num);
        }

        int maxlength = 0;

        for (int num : mp) {
            if (!mp.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (mp.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxlength = Math.max(maxlength, length);
            }
        }

        return maxlength;
    }
}
