import java.util.ArrayList;
import java.util.Arrays;

class Main{
    public static void main(String [] args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add( new ArrayList<>(Arrays.asList(1,2,3)));
        matrix.add( new ArrayList<>(Arrays.asList(4,5,6)));
        matrix.add( new ArrayList<>(Arrays.asList(7,-1,9)));

        int minVal = findMin(matrix);
        System.out.println("Min Value : "+minVal);

       
    }
     public static int findMin( ArrayList<ArrayList<Integer>> arr ){
            int ans = Integer.MAX_VALUE;
            int rows = arr.size();
            int cols = arr.get(0).size();
            for( int i = 0 ;i < rows  ; i++){
                for( int j = 0; j< cols ; j++){
                    if( ans > arr.get(i).get(j)){
                        ans = arr.get(i).get(j);
                    }
                }
            }
            return ans;
        }
}