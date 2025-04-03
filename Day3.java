/* *
    TODO: DAY 3;
!   Only one public class is allowed in a single file.
*   Unary Operators  -  +,-,++a,a++,a--,--a
*   PEMDAS  -  (),exponnents,Mul,divide,add,su
*   L TO Right if same
?   parameters are used in function definition   
*   actual values passed are called arguments ;
?   armstrong number - 1³ + 5³ + 3³ = 153. 
!   Array
*   An array is just a list of values
*   index starts with 0;
*   Arrays are used for storing multiple values in a
*   single variable
 * */ 
import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3 {
   
    public static int A = 5;
    public static void println(Object message) { // Accept any object
        System.out.println(message);
    }
    public static void debug(Object message) { // Accept any object
        System.err.println(message);
    }
    public static void main(String args[])
    {   
         Scanner in = new Scanner(System.in);
         //! Array decalaration
         int[] myInts = new int [5];
         myInts [0] = 5;
        for(int i=0;i<5;i++)
        {
            println(myInts[i]);
        }
         //! Initialize the array
         int[] arr3 = {1, 2, 3, 4, 5}; 
        //! 2d array;
        
        int[][] twoD = new int[2][3]; // declaration
        int[][] inArray = {{1,2,5},{6,3,4}} ;
        int x = inArray.length; 
        int y = inArray[0].length; 
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print(inArray[i][j] + " ");
            }
            println("");
        }
        println("");
   
        for (int a : arr3) {  
            println(a);  // Print each element
        }
        System.out.println("Welcome to day 3");
        ArrayList<Integer> list = new ArrayList<>();
        println("A");
        println(list);
        String s = "welcome to java learning ";
        debug(s);
        run();
        int a = 29;
        int b = 121;
        println(check_Armstrong(b));
        println(check_Armstrong(153));

        println(fib(6)); // shi hai 6th term print kar rha hai
        print_fibonacci(6); // 
        // print_fibonacci(200);
        println(checkPrime(a));
        println(checkPrime(b));
        int lcm = lcm(a,b);
        int gcd = __gcd(a,b);
        println("lcm : " + lcm);
        println("gcd " + gcd);
        int[] arr = {5,10};
        int arr2[] =swap(arr);
        println(arr2 [0]);
        println(arr2 [1]);
  //    TODO :PEMDAS (),exponnents,Mul,divide,add,sub
        // ! L TO Right if same operators
        //
        println(9/3/3 + 2); //1 + 2; 
        println(9/3^0);   //  3^0 = 3 // ^ acting as xor 
        int count = in.nextInt();
        for(int i=0;i<=count;i++)
    {
        System.out.print(fib(i) + " ");
    }
        // println(a);
        // println(b);
    }
    public static void run()
    {
        debug(A);
    }
    public static int[] swap(int[] arr)
    {   
            
            arr[0] = arr[0] ^ arr[1];
            arr[1] = arr[0] ^ arr[1];
            arr[0] = arr[0] ^ arr[1];

           return arr;
    }
    public static int lcm(int a,  int b)
    {   
          return (a*b/(__gcd(a,b)));
    }
    public static int __gcd(int a, int b)
    {
        // if b=0, a is the GCD
        if (b == 0)
            return a;
 
        // call the gcd() method recursively by
        // replacing a with b and b with
        // modulus(a,b) as long as b != 0
        else
            return __gcd(b, a % b);
    }
    public static boolean checkPrime(int a)
    {   
        int div = 0 ;
        for(int i=1;i*i<=a;i++)
        {
            if(a%i==0)
            {
                div++;
                if((a/i)%i==0)
                {
                    div++;
                }
            }
        }
         return div<=2;

    }
    public static void print_fibonacci(int a)
    {
        if(a<0)
        return;
        println(0);
        if(a == 0) return;
        println(1);
        // int curr = 0
        int first = 0 ;int second = 1;
        while(first+second<=a)
        {   
            int third = first + second; // third = curr
            System.out.println(third);
            first = second;
            second  = third;
            
        }
        // return curr/
    }
    
    public static int fib(int n) {

        // If n is 1 or 0, then return n, works for 0th
          // and 1st terms
        if (n <= 1)
            return n;
    
        // Recurrence relation to find the rest of the
          // terms
        return fib(n - 1) + fib(n - 2);
    }
    public static boolean check_Armstrong(int n) {
        if (n == 0) return true;  // Special case for 0
    
        int digits = (int) (Math.log10(n)) + 1; // Use log10 directly
        int num = n;
        int ans = 0;
    
        while (num > 0) {
            int d = num % 10;
            ans += (int) Math.pow(d, digits);  // Cast to int
            num /= 10;
        }
    
        return ans == n;
    }
}


