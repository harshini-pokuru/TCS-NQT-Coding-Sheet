import java.util.*;
public class FrequencyOfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int i:map.keySet()){
                System.out.println("Frequency of "+i+ " is " + map.get(i));
            }
        sc.close();
        
    }
}
