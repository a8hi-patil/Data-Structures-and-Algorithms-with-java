class InvertedHalfPyramidPattern{
    public static void main( String[] args){
        System.out.println("Hello "+args[0]);
        int rows = 7 ;

        for( int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < rows - i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}