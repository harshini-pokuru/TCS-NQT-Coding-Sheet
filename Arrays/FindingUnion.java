
import java.util.*;
//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class FindingUnion
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }
        
        ArrayList<Integer> result = new ArrayList<>(set);
        
      return result;
    }
}

