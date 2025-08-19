import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    private static void printMatrix( ArrayList<ArrayList<Integer>> arr){
        int rows = arr.size();
        int cols = arr.get(0).size();
        for( int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < cols ; j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println(); 
        }
    }
    private static void transpose( ArrayList<ArrayList<Integer>> arr){
        int rows = arr.size();
        int cols = arr.get(0).size();
        for( int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < i ; j++){
                int temp = arr.get(i).get(j);
                arr.get(i).set(j, arr.get(j).get(i));
                arr.get(j).set(i,temp); 
            }
        }
    }
    public static void main ( String[] args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
        matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
        matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));

        printMatrix(matrix);
        System.out.println("------------");
        transpose(matrix);
        System.out.println("------------");
        printMatrix(matrix);
    }
}