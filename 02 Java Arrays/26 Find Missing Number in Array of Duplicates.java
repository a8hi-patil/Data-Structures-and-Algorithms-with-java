class Main{
    private static int findMissingNumber(int[] arr){
        int len = arr.length;
        for( int i =  0 ; i < len ; i++){
            if( arr[i] < 0){
                continue;
            }else{
                int idx = arr[i];
                if( idx < len){
                    arr[idx]*=-1;
                }
            }
        }
        for( int i =  0 ; i < len ; i++){
            if(arr[i]>0) return i;
        }
        return -1;
    }
    public static void main( String [] args){
        int[] arr={9,6,4,2,3,5,7,0,1};
        int res = findMissingNumber(arr);
        System.out.println("Missing Number "+ res);
    }
}