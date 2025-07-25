//Problem#2 Given two strings, we have to fing they are anagram or not 
// for this we will create a frequent array 

class Anagram{
  public boolean AnagramSolution(String s, String t){ //return statement returning boolean to check if anagram is there or not
    if (s.length() != t.length()) return false; //checking length if length is not same then no sense of checking 
    int [] freq = new int[26]; //creating the new frequent integer array and store 26 into it
    for (int i=0; i<s.length(); i++){ //itrating through the string and increment a of first nad decrement of another
      freq[s.charAt(i) -'a']++; //incement for s
      freq[t.charAt(i) -'a']--; //decrement for t
    }
    for (int count: freq){ //then we check the frequency count 
      if (count != 0){ //if its zero then number is anagram
        return false; //if not return false
      }
    }
    return true;
  }
}


// Time Complexity = O(n) Space Complexity = O(1) 
