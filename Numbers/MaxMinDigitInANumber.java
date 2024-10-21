package Numbers;
import java.util.*;
public class MaxMinDigitInANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(n>0){
            int ld = n%10;
            max= Math.max(max,ld);
            min=Math.min(min,ld);
            n=n/10;
        }
        System.out.println("Maximum digit: "+max);
        System.out.println("Minimum digit: "+min);

        sc.close();
    }
}
