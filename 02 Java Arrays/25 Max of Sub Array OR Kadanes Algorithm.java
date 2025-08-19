class Main{

    private static int kadanesAlgorithm( int[] arr){

        int maxSum = 0 ;
        int curSum = 0;

        for( int i = 0 ; i < arr.length ; i++){
            curSum+= arr[i];
            maxSum=Math.max(maxSum,curSum);
            if( curSum < 0 ){
                curSum = 0;
            }
        }
        return maxSum;


    }
    public static void main( String[] args){
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(kadanesAlgorithm(arr));
     }
}

