import java.util.*;
public class ReverseAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Reverse(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }

    public static void Reverse(int[] arr, int n){
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
}
