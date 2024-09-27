import java.util.*;
public class EquilibriumIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Equi(arr, n));
        sc.close();
    }

    public static int Equi(int[] arr, int n){
        int num = -1;
        for(int i=0;i<n;i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int j=0;j<i;j++){
                leftSum += arr[j];
            }
            for(int j=n-1;j>i;j--){
                rightSum += arr[j];
            }

            if(leftSum == rightSum){
                num = arr[i];
                break;
            }

        }

    return num;
    }
}
