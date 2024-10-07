public class RecursionEvaluation {

    public static void main(String[] args) {
        System.out.println("Start recursion:");
        int result = evaluate(5);
        System.out.println("Final result: " + result);
    }

    /**
     * @param n 
     * @return 
     */
    public static int evaluate(int n) {
        System.out.println("Entering evaluate(" + n + ")");
        
        
        if (n <= 1) {
            System.out.println("Base case reached with n = " + n);
            return 1;
        }

        
        int recursiveResult = evaluate(n - 1);  
        System.out.println("Returning from evaluate(" + n + "), recursive result: " + recursiveResult);

        return n * recursiveResult;
    }
}
