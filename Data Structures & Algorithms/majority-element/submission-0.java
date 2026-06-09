class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> m = new HashMap<>();
        for(int i : nums)
        {
            if(m.containsKey(i))
            {
                m.put(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> m1:m.entrySet())
        {
            if(m1.getValue()>nums.length/2)
            {
                return m1.getKey();
            }
        }

        return -1;


        
    }
}