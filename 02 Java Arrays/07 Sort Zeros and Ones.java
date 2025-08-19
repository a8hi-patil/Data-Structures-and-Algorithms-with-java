class Main{
    static void sortZerosAnsOne( int[] arr){
        int start = 0 ; int end = arr.length -1;
        while( start < end){
            if( arr[start] == 0) start++;
            else if( arr[end] == 1 )end--;
            else {
                arr[start] = arr[start] + arr[end];
                arr[end] = arr[start] - arr[end];
                arr[start] = arr[start] - arr[end];
            }
        }
    }
    public static void main (  String [] args){
        int [] arr = {0, 1, 0, 0, 1, 1, 0};
        sortZerosAnsOne(arr);
        for( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + ", ");
        }

    } 

}
