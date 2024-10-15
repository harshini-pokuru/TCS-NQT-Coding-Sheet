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
            System.out.println(n +" is a perfect number");
        }else{
            System.out.println(n +" is not a perfect number");
        }
        sc.close();
    }

    public static boolean check(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
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


// import java.util.*;
// public class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int sum = 1;
//     if(n==1){
//       System.out.println("1 is not a perfect number");
//     }
//    for(int i=2;i<=Math.sqrt(n);i++){
//      if(n%i == 0){
//        sum += i;
//        System.out.print(i+" ");
//        if(n/i != i){
//          sum += n/i;
//          System.out.print(n/i+" ");
//        }
//      }
//    }
//    if(sum == n){
//      System.out.println(n+" is a perfect number");
//    }else{
//      System.out.println(n+" is not a perfect number");
//    }
//   }
// }