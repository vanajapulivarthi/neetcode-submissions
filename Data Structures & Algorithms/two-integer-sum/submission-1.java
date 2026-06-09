class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] n=new int[2];
        Map<Integer,Integer> m= new HashMap<Integer,Integer>();
        for(int t=0;t<nums.length;t++){
            if(m.containsKey(target-nums[t]))
            {
                n[1]=t;
                n[0]=m.get(target-nums[t]);
                return n;

            }
            m.put(nums[t],t);
        }
        return n;
    
        
        
    }
}
