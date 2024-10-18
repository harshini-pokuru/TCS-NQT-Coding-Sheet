package Numbers;
import java.util.*;
public class SumOfAPSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //no. of terms
        double a = sc.nextDouble(); //First term
        double d = sc.nextDouble(); //Common difference

        double sum = (n*((2*a + ((n-1)*d)))/2);
        System.out.println(sum);

        sc.close();
    }
}
