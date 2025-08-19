import java.util.Scanner;

class Main{
     static boolean findTarget (int target, int[] arr){
        for( int i = 0 ; i < arr.length ; i++){
            if( arr[i] == target ) return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target : ");
        int target = sc.nextInt();
        
        if( findTarget(target,arr)){
            System.out.println("Target found ");
        }else{
            System.out.println("Target not found");
        }
    }
}

