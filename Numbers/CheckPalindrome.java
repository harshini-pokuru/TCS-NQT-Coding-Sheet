package Numbers;
import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        boolean pal = true;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                pal = false;
                break;
            }
        }
        if(pal){
            System.out.println(s +" is a palindrome");
        }else{
            System.out.println(s +" is not a palindrome");
        }
        sc.close();
    }
}
