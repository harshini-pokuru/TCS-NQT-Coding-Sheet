import java.util.*;
public class CircularRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //int k = sc.nextInt();

        Reverse(arr, 0, n-1);
        Reverse(arr, 0, k-1);
        Reverse(arr, k, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }

    public static void Reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
