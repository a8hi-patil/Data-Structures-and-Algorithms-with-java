public class Main{
    static void printArray(int[]arr){
        for( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        System.out.println("------------------");
    }
    static void rotateArray( int[]arr, int k){
        // check is it neccessary to rotate
        k = k % arr.length ;
        if( k == 0) return;

        //create temp array;
        int [] temp = new int[k];

        //copy element in temp array
        int j = 0;
        for( int i = arr.length - k ; i < arr.length ; i++){
            temp[j++]=arr[i];
        }
        //shift elements in main array
        for( int i = arr.length-1 ; i >= k ; i--){
            arr[i] = arr[i-k];
        }
        //copy back from temp array
        for( int i = 0; i < k ; i++){
            arr[i] = temp[i];
        }
    }

    public static void main( String[] args){
        int [] arr ={1,2,3,4,5};
        int k = 2;
        printArray(arr);
        rotateArray(arr,k);
        printArray(arr);
    }
}