/*
 * This programme calculates the power degree of the number num using recursion.
 * First, the programme reads two numbers num and power using the Scanner object.
 * Then the function powerOfNumbers(num, power) is called, which recursively calculates the degree of the number.
 *
 * The powerOfNumbers(num, power) function works as follows:
 * - If the power degree is 0, the result is 1 (base case).
 * - Otherwise, the result is equal to the number num multiplied by the result of calculating
 * the previous degree of the number, powerOfNumbers(num, power - 1).
 *
 * Example:
 * If the user enters the numbers 2 and 10, the programme will output the result 2^10 = 1024.
 */

import java.util.Scanner;
public class problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(powerOfnumbers(number, power));
    }
    public static long powerOfnumbers(int num , int power) {
        if (power == 0) {
            return 1;
        }
        else {
            return num * powerOfnumbers(num, power - 1);
            }
        }
    }
