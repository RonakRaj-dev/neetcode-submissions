class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int remain = target - nums[i];
            if(sum.containsKey(remain)) return new int[]{sum.get(remain), i};
            sum.put(nums[i], i);
        }
        return new int[]{};
    }
}
