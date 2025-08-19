import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    private static void rowWiseSum( ArrayList<ArrayList<Integer>> arr){
        int rows = arr.size();
        int cols = arr.get(0).size();
        int curSum = 0;
        for( int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < cols ; j++){
                curSum+=arr.get(i).get(j);
            }
            System.out.println("Sum of row " + (i+1) + " is " + curSum );
            curSum=0;
        }
    }
    private static void colWiseSum( ArrayList<ArrayList<Integer>> arr){
        int rows = arr.size();
        int cols = arr.get(0).size();
        int curSum = 0;
        for( int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < cols ; j++){
                curSum+=arr.get(j).get(i);
            }
            System.out.println("Sum of col " + (i+1) + " is " + curSum );
            curSum=0;
        }
    }
    public static void main ( String[] args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
        matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
        matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));

        rowWiseSum(matrix);
        System.out.println("------------");
        colWiseSum(matrix);
    }
}