class MaxNumber{
    public int findMax( int[] arr){
        int ans = Integer.MIN_VALUE;
        for( int i = 0 ; i < arr.length ; i++){
            if( arr[i] > ans)
                ans = arr[i];
        }
        return ans;
    }
}
class Main{
    public static void main ( String[] args ){
        int [] arr= {10,21,3,50,2};
        MaxNumber mx = new MaxNumber();
        System.out.println(mx.findMax(arr));
    }
}