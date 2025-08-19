class HollowFullPyramidPattern{
    public static void main( String[] args){
        int rows = 5;

        for( int i = 0 ; i < rows ; i ++){
            for( int j = 0 ; j < rows - i -1 ; j++){
                System.out.print(" ");
            }
            for( int k = 0 ; k < i + 1 ; k++){
                if( k == 0 || k == i || i==rows-1){

                System.out.print("* ");
                }else{

                System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}