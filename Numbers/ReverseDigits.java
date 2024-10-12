package Numbers;
import java.util.*;
public class ReverseDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastDigit = 0;
        int reverse = 0;
        while(num>0){
            lastDigit = num%10;
            reverse = reverse *10+lastDigit;
            num = num/10;
        }
        System.out.println(reverse);
        sc.close();
    }
}
