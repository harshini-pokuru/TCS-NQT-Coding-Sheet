package Numbers;
import java.util.*;
public class PrimeInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }

    public static boolean isPrime(int n){
        int cnt=0;
        for(int i=1;i<= Math.sqrt(n);i++){
            if(n%i == 0){
                cnt++;
                if(n/i != i){
                    cnt++;
                }
            }
        }
        if(cnt == 2){
            return true;
        }
    return false;
    }
}
