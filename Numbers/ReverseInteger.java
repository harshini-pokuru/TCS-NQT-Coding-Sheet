
package Numbers;
import java.util.*;
public class ReverseInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(Reverse(x));

        sc.close();   
    }

    public static int Reverse(int x){
        int sign = x>0 ? 1 :-1 ;
        x = Math.abs(x);
        int rev = 0;
        int lastDigit= 0;
        while(x>0){
            lastDigit=x%10;
            if(rev > (Integer.MAX_VALUE - lastDigit)/10){
                return 0;
            }
            rev = rev*10 +lastDigit;
            x=x/10;
        }

    return rev*sign;
    }
}
