import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Main {
    private static int findSingleNumber( ArrayList<Integer> arr){
        Map<Integer,Integer> map = new HashMap<>();
        for( int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for( int key : map.keySet()){
            if( map.get(key) == 1) return key;
        }
        return -1;
    }
    public static void main ( String [] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 1, 2, 1, 2,4));
        int singleNumber = findSingleNumber(arr);
        System.out.println("Single Number in Array is " + singleNumber);
    }
}