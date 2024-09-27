//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
import java.util.*;
class SingleNumber {
    public int singleNumber(int[] arr) {
     int n = arr.length;
    int num =0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<n;i++){
      map.put(arr[i], map.getOrDefault(arr[i],0)+1);
    }
    
    for(int i: map.keySet()){
      if(map.get(i) == 1){
        num = i;
      }
    }
    return num;
    }
}