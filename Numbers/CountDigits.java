package Numbers;
import java.util.*;
public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int cnt = 0;
        // while(num > 0){
        //     num = num/10;
        //     cnt++;
        // }
        // System.out.println(cnt);

        int cnt = (int)(Math.log10(num) + 1);
        System.out.println(cnt);

        int k = String.valueOf(num).length();
        System.out.println(k);

        sc.close();
    }
}
