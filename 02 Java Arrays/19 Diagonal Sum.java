import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    private static void diagonalSum( ArrayList<ArrayList<Integer>> arr){
        int rows = arr.size();
        int curSum = 0;
        for( int i = 0 ; i < rows ; i++){
            curSum+=arr.get(i).get(i);
        }
        System.out.println("Sum of diagonal is " + curSum );
    }
    private static void diagonalSum2( ArrayList<ArrayList<Integer>> arr){
        int rows = arr.size();
        int curSum = 0;
        for( int i = 0 ; i < rows ; i++){
            curSum+=arr.get(i).get(rows-i-1);
        }
        System.out.println("Sum of diagonal is " + curSum );
    }
    public static void main ( String[] args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
        matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
        matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));

        diagonalSum(matrix);
        System.out.println("------------");
        diagonalSum2(matrix);
    }
}