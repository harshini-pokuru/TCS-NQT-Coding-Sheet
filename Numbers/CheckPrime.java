package Numbers;
import java.util.*;
public class CheckPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println(n +" is a prime number");
        }else{
            System.out.println(n +" is not a prime number");
        }

        sc.close();
    }
    public static boolean isPrime(int n){
        int cnt = 0;
        for(int i=1; i<=Math.sqrt(n);i++){
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
