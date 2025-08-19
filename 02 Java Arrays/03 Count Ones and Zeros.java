class CountOneAndZeros{
    public void count(int[] arr){
        int countOne = 0;
        int countZero = 0;

        for( int i = 0 ; i < arr.length ; i++){
            if( arr[i] == 0 ) countZero++;
            else if( arr[i] == 1 ) countOne++;
        }
        System.out.println("Count of Zero " + countZero);
        System.out.println("Count of One " + countOne);
    }
}



class  Main
{
    public static void main( String [] args){
    int arr[] = {1, 0, 1, 1, 0, 0, 1, 2, 0};
    CountOneAndZeros obj = new CountOneAndZeros();
    obj.count(arr);
    }
}