class InvertedHollowHalfPyramidPattern {
    public static void main ( String [] args ) {

        int rows = 7 ;

        for( int i = 0 ; i < rows ; i++){
            for( int j = 0 ;  j < rows -i; j++){
                if( i == 0 || j ==0 || j == rows - i - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}