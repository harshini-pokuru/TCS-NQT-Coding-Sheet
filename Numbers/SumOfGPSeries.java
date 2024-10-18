package Numbers;
import java.util.*;
public class SumOfGPSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //No. of terms
        double a = sc.nextDouble(); //First term
        double r = sc.nextDouble(); //Common ratio

        System.out.println(GPSum(n, a, r));

        sc.close();
    }
    public static double GPSum(int n, double a, double r){
        if(r==1){
            return a*n;
        }

        double sum = a*((1-Math.pow(r,n))/(1-r));

    return sum;
    }
}
