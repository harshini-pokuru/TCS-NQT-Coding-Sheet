package Numbers;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isArmstrong(n));

        sc.close();
    }
    public static boolean isArmstrong(int n){
        int length = String.valueOf(n).length();
        int sum = 0;
        int num = n;
        int ld = 0;
        while(num>0){
            ld = num%10;
            sum += Math.pow(ld, length);
            num = num/10;
        }
        if(sum == n){
            return true;
        }
    return false;
    }
}
