import java.util.*;
public class MaxProductSubarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProd(arr, n));

        sc.close();
    }

    public static int maxProd(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int leftProd = 1;
        int rightProd = 1;
        for(int i=0;i<n;i++){
            if(leftProd == 0){
                leftProd = 1;
            }
            if(rightProd== 0){
                rightProd = 1;
            }

            leftProd *= arr[i];
            rightProd *= arr[n-i-1];
            max = Math.max(leftProd, Math.max(max,rightProd));
        }

        return max;
    }
}
