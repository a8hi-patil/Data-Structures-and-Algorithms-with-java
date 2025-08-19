class Main{
public static void main( String[] args)
{
   int a = 5 ;
   int b = 9;
   System.out.println("A = " + a + " B = "+b);

    b = a + b; //14 = 5 + 9; 
    a = b - a; // 9 = 14 - 5;
    b = b - a;  // 6 = 14 - 9

   System.out.println("A = " + a +" B = "+b);
}
}
