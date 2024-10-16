import java.util.*;
public class OnetonWithoutLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numbers = printNos(num);
        for(int i=0;i<num;i++){
            System.out.print(numbers[i]+" ");
        }
        sc.close();
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] result = new int[x];
        fillArray(result,x);

    return result;
    }

    public static void fillArray(int[] result, int x){
        int n=0;
        while(n<x){
            result[n] = n+1;
            n++;
        }
    }
}
