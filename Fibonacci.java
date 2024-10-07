import java.util.Scanner;

class GFG {
    
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < N; i++) {
            
            System.out.print(num1 + " ");

           
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    
    public static void main(String args[])
    {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of Fibonacci numbers to display: ");
        int N = scanner.nextInt();

        
        Fibonacci(N);

        
        scanner.close();
    }
}
