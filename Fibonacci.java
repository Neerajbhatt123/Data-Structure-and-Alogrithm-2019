import java.util.Scanner;
class Fibonacci 
{ 
    // static int fib(int n) 
    // { 
    // if (n <= 1) 
    //    return n; 
    // return fib(n-1) + fib(n-2); 
    // } 

    static int fib(int n) 
    { 
        int a = 0, b = 1, c; 
        if (n == 0) 
            return a; 
        for (int i = 2; i <= n; i++) 
        { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        return b; 
    } 
    public static void main (String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :::");
    int n = sc.nextInt();

    System.out.println(fib(n)); 
    } 
} 