import java.util.*;
public class MaxSubarraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(MaxSub(arr, n));

        sc.close();
    }

    public static int MaxSub(int[] arr, int n){
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }else if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
