class Main {

    static int[] twoSum (int [] arr, int target){

        for( int i = 0 ; i < arr.length ; i++){
        for( int j = i+1 ; j < arr.length ; j++)
            if( target == arr[i] + arr[j])
                return new int[]{i,j};
        }

        return new int[]{-1,-1};
    }

    public static void main( String[] args){
        int[] arr  = {10, 20, 30, 40, 50};
        int[] ans  = twoSum(arr, 701);
        if( ans[0] != -1 && ans[1] !=-1){
        System.out.print("Pair Found : ");
        System.out.print(ans[0] + "-"+ ans[1]);
        }else{
        System.out.print("Pair Not Found.");
        }
     }
}
  