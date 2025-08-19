class Main{

static void printExtreams(int[] arr)
{
    int start = 0;
    int end = arr.length-1;

    while( start <= end){
        System.out.println(arr[start] + " " + arr[end]);
        start++;
        end--;
    }
}

public static void main( String []args)
{
   
    int[] arr = {10, 20, 30, 40, 50};
    printExtreams(arr);
}
}