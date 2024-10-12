package Numbers;
import java.util.Scanner;
public class CheckPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0)
            System.out.println(n+" is Positive number");
        else
            System.out.println(n+" is a Negative number");
        sc.close();
    }
}