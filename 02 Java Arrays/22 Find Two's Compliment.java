import java.util.ArrayList;
import java.util.Arrays;
class Main{
    private static void printArray( ArrayList<Integer> arr ){
        int size = arr.size();
        for( int i = 0 ; i < size ; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    } 
    private static void onesCompliment( ArrayList<Integer> arr){
        int size = arr.size();
        for( int i = 0 ; i < size ; i++){
          int num = arr.get(i) == 0 ? 1 :0;
          arr.set(i,num);
        }
    }
    private static void twosCompliment(ArrayList<Integer>arr){
        onesCompliment(arr);
        int size = arr.size();
        int c = 1 ;
        for( int i = size -1 ; i >= 0 ; i--){
          int sum = c + arr.get(i);
          int digit = sum % 2 ;
          arr.set(i,digit);
          c = sum / 2;
        }
        if(c != 0){
            arr.add(0,c);
        } 
    }
    public static void main( String[] args){
        ArrayList<Integer> arr = new ArrayList<>( Arrays.asList(0,0));
        printArray( arr );
        twosCompliment(arr);
        printArray( arr );
    }
}