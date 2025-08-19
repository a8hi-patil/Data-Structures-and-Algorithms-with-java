class Main{

static int findUnique(int arr[])
{
   int ans = 0;
   for( int i = 0 ; i < arr.length ; i++){
    ans = ans ^ arr[i];
   }
   return ans;
}

public static void  main( String[] args )
{
    
    int[] arr = {1, 2, 1, 2, 3};

    System.out.println( findUnique(arr));
   
}
}