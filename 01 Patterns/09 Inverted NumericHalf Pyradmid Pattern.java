class InvertedNumericHalfPyradmidPattern{
    public static void main ( String[] args ){
        int rows = 6;
        int counter = 1;

        for( int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < rows - i ; j++){
                System.out.print(counter++);
                System.out.print(" ");
            }
            System.out.println();
        }
    } 
}