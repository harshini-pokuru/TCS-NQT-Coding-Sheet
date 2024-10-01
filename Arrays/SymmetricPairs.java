import java.util.*;
public class SymmetricPairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] arr = new int[row][2];
        for(int i=0; i<row; i++){
            for(int j=0; j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=i+1; j<row; j++){
                if((arr[i][0] == arr[j][1]) && (arr[j][0] == arr[i][1])){
                    System.out.print("("+arr[i][0]+","+ arr[i][1]+")");
                }
            }
        }

        sc.close();
    }
}
