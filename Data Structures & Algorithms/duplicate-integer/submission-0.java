class Solution {
    public boolean hasDuplicate(int[] nums) {
         ArrayList<Integer> seen = new ArrayList<>();
        
        // Iterate through each number in the array
        for (int num : nums) {
            // If the number is already in the list, we have found a duplicate
            if (seen.contains(num)) {
                return true;
            }
            // Add the number to the list
            seen.add(num);
        }
        
        // If no duplicates are found, return false
        return false;
 
    }
}
