import java.util.Scanner;

/**
 * This class contains a method to calculate the power of a number using recursion.
 * It takes user input for the base number and the exponent, and outputs the result of raising the base to the exponent.
 */
public class problem6 {

    /**
     * Main method to read user input, call the powerOfnumbers method, and output the result.
     * Time Complexity: O(n)
     * - The method calls itself recursively 'power' times.
     * - The worst-case time complexity occurs when the exponent is 'power'.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(powerOfnumbers(number, power));
    }

    /**
     * Method to calculate the power of a number using recursion.
     * Time Complexity: O(n)
     * - The method calls itself recursively 'power' times.
     * - The worst-case time complexity occurs when the exponent is 'power'.
     *
     * @param num The base number.
     * @param power The exponent.
     * @return The result of raising 'num' to the power of 'power'.
     */
    public static long powerOfnumbers(int num , int power) {
        if (power == 0) {
            return 1;
        }
        else {
            return num * powerOfnumbers(num, power - 1);
        }
    }
}
