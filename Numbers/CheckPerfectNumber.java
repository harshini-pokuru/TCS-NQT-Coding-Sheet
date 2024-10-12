//A perfect number is a number that is the sum of all its positive divisors, excluding the number itself.
// Example 1: 6 = 1+2+3
// Example 2: 28 = 1+2+4+7+14
package Numbers;
import java.util.*;
public class CheckPerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(check(n)){
            System.out.println(n +"is a perfect number");
        }else{
            System.out.println(n +" is not a perfect number");
        }
        sc.close();
    }

    public static boolean check(int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n){
            return true;
        }
    return false;
    }
}
