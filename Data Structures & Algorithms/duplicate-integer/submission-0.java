class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> elements=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(elements.containsKey(nums[i])){
                return true;
            };
           elements.put(nums[i],i);
        };
       return false;
    }
}