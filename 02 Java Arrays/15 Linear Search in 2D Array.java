class Main{
    public static void main( String[] args){
        int [][]arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = 3;
        int col = 3;
        int target = 4;
        int res = rowWisePrinting(arr, row, col, target);
        if( res != -1){
            System.out.println("Found !!");
        }else{
            System.out.println("Not Found !!");
        }
      
    }
    public static int rowWisePrinting( int [][]arr, int row, int col, int target){
        for( int i = 0 ; i < row ; i++){
            for( int j = 0 ; j < col ; j++){
               if( arr[i][j] == target) return 1;
            }
        }
        return -1;        
    }
   
}