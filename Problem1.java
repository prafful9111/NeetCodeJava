// Problem-1 in which we need to find if the duplicate element is present in the array 
// to address this problem the concept of HashSet is used, Hashset stores unique elements in java 

import java.util.HashSet;

class Solution1{
    public boolean Duplicate(int[] nums){ //this is the return statement where we write after public what we need in output here it is boolean
        HashSet<Integers> SeenNumbers = new HashSet<(); //this is how we use hashSet <Integers> for storing the num values
        for (int num: nums){ //check for each num in the array 
            if(SeenNumbers.contains(num)){ //if it contains numbers from hashset
                return true; //then duplicate found 
            }
            SeenNumbers.add(num); //otherwise add the number in hashset
        }
        return false; //return false no duplicate found 
    }
}

//Time Complexity = O(n) Space Complexity = O(n)
