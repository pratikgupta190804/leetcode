class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int required = target - nums[i];
            map.put(required, i);
            System.out.println(required);
        }
        int[] result = new int[2];
        for(int i = 0; i < n; i++){
            int req = map.getOrDefault(nums[i], Integer.MAX_VALUE);
            System.out.println(req);
            if(req != i && req != Integer.MAX_VALUE) {
                result[0] = i;
                result[1] = req;
                break;
            }
        }
        return result;
    }
}