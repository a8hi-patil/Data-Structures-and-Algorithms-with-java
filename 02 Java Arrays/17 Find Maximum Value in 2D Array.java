import java.util.ArrayList;
import java.util.Arrays;

class Main{
    public static void main( String[] args){
        ArrayList<ArrayList<Integer>> m = new ArrayList<>();
        m.add(new ArrayList<>(Arrays.asList(1,4,5,2)));
        m.add(new ArrayList<>(Arrays.asList(11,24,15,22)));
        m.add(new ArrayList<>(Arrays.asList(12,24,455,222)));

        int maxVal = findMax(m);
        System.out.println("Max value : "+ maxVal);
    }
    public static int findMax( ArrayList<ArrayList<Integer>> arr){
        int maxVal = Integer.MIN_VALUE;
        int row = arr.size();
        int col = arr.get(0).size();
        for( int i = 0 ; i < row ; i++){
            for( int j = 0 ; j < col ; j++){
                if( maxVal < arr.get(i).get(j) ){
                    maxVal = arr.get(i).get(j);
                }
            }
        }

        return maxVal;
    }
}