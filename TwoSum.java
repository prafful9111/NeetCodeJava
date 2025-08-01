//Problem #3 to find the element and index of sum of two  number in target also called as target sum in short 
//HashMap has the property of storing key and value together 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); //we will use the HashMap to store the array element and their index first
        for ( int i=0; i<nums.length; i++){ //itrate through the array 
            int remaining = target - nums[i]; //calculate the remaining number when substracted by target for each element

            if (map.containsKey(remaining)){ //if the hashmap already contains the remaining element then 
                return new int [] {map.get(remaining), i}; //return a new array with remaining number and its index
            }
            map.put(nums[i], i); //if not then put that into map 
        }
        return new int [] {}; //empty returm stateent to make sure the code does not conflict on run time.
    }
}

// Time Complexity O(n) Spae Complexity O(n) 


