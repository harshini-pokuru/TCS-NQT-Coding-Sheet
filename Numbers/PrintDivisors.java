package Numbers;
import java.util.*;
public class PrintDivisors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                System.out.print(i +" ");
                if(n/i != i){
                    System.out.print(n/i +" ");
                }
            }
        }
        System.out.println();

        ArrayList<Integer> divisors = findDivisors(n);
        Collections.sort(divisors);
        for(int divisor: divisors){
            System.out.print(divisor +" ");
        }

        sc.close();
    }

    //Using ArrayList
    public static ArrayList<Integer> findDivisors(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);
        for(int i=1;i<= sqrtN;i++){
            if(n%i == 0){
                divisors.add(i);

                if(n/i != i){
                    divisors.add(n/i);
                }
            }
        }
        return divisors;
    }
}