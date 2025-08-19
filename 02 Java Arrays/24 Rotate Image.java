import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Main{
    private static void printArray( ArrayList<ArrayList<Integer>> arr){
        int rows = arr.size();
        int cols = arr.get(0).size();

        for( int i = 0 ; i < rows ; i++){
            for( int j = 0; j<cols ; j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    };
    private static void transpose( ArrayList<ArrayList<Integer>> arr){
        int rows = arr.size();

        for( int i = 0 ; i < rows ; i++){
            for( int j = 0; j < i ; j++){
               int temp = arr.get(i).get(j);
               arr.get(i).set(j, arr.get(j).get(i));
               arr.get(j).set(i, temp);
            }
        }
    };
    private static void reverseRow(ArrayList<ArrayList<Integer>> arr){
         int rows = arr.size();

        for( int i = 0 ; i < rows ; i++){
            Collections.reverse(arr.get(i));
        }
    };
    public static void main( String [] args){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1,2,3)));
        arr.add(new ArrayList<>(Arrays.asList(4,5,6)));
        arr.add(new ArrayList<>(Arrays.asList(7,8,9)));
        printArray(arr);
        transpose(arr);
        reverseRow(arr);
        printArray(arr);
    };
}