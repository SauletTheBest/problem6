import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(factor(number));
    }

    // This method calculates the factorial of a given integer 'x' using recursion.
    public static int factor(int x){
        // Base case: if 'x' is less than or equal to 1, return 'x'.
        if(x <= 1){
            return x;
        }
        // Recursive case: if 'x' is greater than 1, return 'x' multiplied by the factorial of 'x-1'.
        else{
            return x * factor(x - 1);
        }
    }
}
