package Numbers;
import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Gcd of "+a+ " and "+b+ " is "+gcd(a, b));

        sc.close();
    }

    public static int gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b = b%a;
            }
        }
        if(a == 0){
            return b;
        }

    return a;
    }
}
