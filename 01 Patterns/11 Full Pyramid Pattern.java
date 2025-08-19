class FullPyramidPattern{
    public static void main  ( String [] args){
        int rows = 6;
        for( int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < rows - i ; j++){
                System.out.print(" ");
            }
            for( int k = 0 ; k < i +1 ; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}