import java.util.*;
public class Smallestnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Minimum(arr, n));

        sc.close();
    }
    public static int Minimum(int[] arr, int n){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }
}
