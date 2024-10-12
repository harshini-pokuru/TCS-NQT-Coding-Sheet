//Printing all the palindromes in the given range
package Numbers;
import java.util.*;
public class PalindromesInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        for(int i=min;i<=max;i++){
            if(isPalindrome(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    public static boolean isPalindrome(int k){
        String s = Integer.toString(k);
        int n = s.length();
        boolean pal = true;
        for(int i=0; i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                pal = false;
                break;
            }
        }
    return pal;
    }
}
