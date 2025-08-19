class Main{
    public static void main( String[] args){
        int [][]arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = 3;
        int col = 3;
        rowWisePrinting(arr, row, col);
        System.out.println();
        columnWisePrinting(arr, row, col);
        System.out.println();
        diagonalPrinting(arr, row, col);
        System.out.println();
        reverseDiagonalPrinting(arr, row, col);
    }
    public static void rowWisePrinting( int [][]arr, int row, int col){
        for( int i = 0 ; i < row ; i++){
            for( int j = 0 ; j < col ; j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
        System.out.println("------Row wise printing------");
        System.out.println();
    }
    public static void columnWisePrinting( int [][]arr, int row, int col){
         for( int i = 0 ; i < row ; i++){
            for( int j = 0 ; j < col ; j++){
                System.out.print(arr[j][i]+", ");
            }
            System.out.println();
        }
        System.out.println("------Column wise printing------");
        System.out.println();
    }
    public static void diagonalPrinting( int [][]arr, int row, int col){
            for( int i = 0; i < row ; i++){
                System.out.print(arr[i][i]+", ");
            }
            System.out.println();
            System.out.println("------Diagonal wise printing------");
    }
    public static void reverseDiagonalPrinting( int [][]arr, int row, int col){
        
            for( int i = 0; i < row ; i++){
                System.out.print(arr[i][col-i-1]+", ");
            }
            System.out.println();
            System.out.println("------Diagonal wise printing------");
    }
}