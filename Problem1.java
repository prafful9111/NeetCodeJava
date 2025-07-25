// Problem-1 in which we need to find if the duplicate element is present in the array 
// to address this problem the concept of HashSet is used, Hashset stores unique elements in java 

import java.util.HashSet;

class Solution1{
    public boolean Duplicate(int[] nums){
        HashSet<Integers> SeenNumbers = new HashSet<();
        for (int num: nums){
            if(SeenNumbers.contains(num)){
                return true;
            }
            SeenNumbers.add(num);
        }
        return false;
    }
}