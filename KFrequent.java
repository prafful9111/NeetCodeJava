class Solution{
  public int[] KFrequent (int [] nums, int k ){
    Map<Integer, Integer> count = new HashMap<> (); //Initialize a HashMap store element along with their frequency
    List<Integer> [] freq = new List [nums.length + 1]; //Create a bucket list where indexes of array are treated as frequency 
    for (int i=0; i<freq.length; i++){ //Itrating through the loop 
      freq[i] = new ArrayList<>(); //Creating a each bucket as a list of frequency array because an multiple element has same frequency
    }
    for (int n: nums){ //using GetorDefault to put values
      count.put(n, count.getOrDefault(n, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entry: count.entrySet()){ //Making te Entry in the freq array ( Buckets) 
      freq[entry.getValue()].add(entry.getKey());
    }
    int index = 0;//initializing the index variable with zero value
    int [] res = new int [k]; //createing a new array name res to store result has the initial value k
    for (int i=freq.length -1; i>0 && index < k; i--){ //Itrating backward to get top k frequent element 
      for (int n: freq[i]){
        res[index++] =n;
        if(index == k){
          return res;
        }
      }
    }
    return res;
  }
}
