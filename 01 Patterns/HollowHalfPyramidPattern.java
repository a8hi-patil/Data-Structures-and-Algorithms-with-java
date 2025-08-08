class HollowHalfPyramidPattern {
    public static void main ( String [] args){
        int rows = 7;

        for( int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < i + 1 ; j ++){
                if( j == 0 || j == i || i == rows-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}