class HollowDiamondPattern {
    public static void main ( String[] args){
        int rows = 5;

        for( int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < rows - i -1 ;j++){
                System.out.print(" ");
            }
            for( int j = 0 ; j < i+1 ;j++){
                if( j == 0 ||  j == i  )
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        rows--;
        for( int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < i + 1 ;j++){
                System.out.print(" ");
            }
            for( int j = 0 ; j < rows -i ;j++){
                if( j == 0 ||  j == rows - i -1  )
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}