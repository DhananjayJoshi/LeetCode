class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> buffer = new HashMap<>();
        int []result = new int[2];
        
        for(int i = 0; i < nums.length; i++ ){
            if(buffer.get(target - nums[i]) == null){
                buffer.put(nums[i], i);
            }else{
                result[0] = buffer.get(target - nums[i]);
                result[1] = i;
            }
        }
        return result;
    }
        
}