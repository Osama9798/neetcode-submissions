class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> check = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int targetNum=target-nums[i];
            if(check.containsKey(nums[i]))
            { 
                return new int[] { check.get(nums[i]), i };
               
            }else
            {
            check.put(targetNum,i);}
        }
        System.out.println(check);
        return  new int[] { 0 };
    }
}
