import java.util.*;
public class InsertAnElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int newIndex = sc.nextInt();
        int newElement = sc.nextInt();

        for(int i=n;i>newIndex;i--){
            arr[i]=arr[i-1];
        }
        arr[newIndex] = newElement;

        for(int i=0;i<n+1;i++){
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }
}
