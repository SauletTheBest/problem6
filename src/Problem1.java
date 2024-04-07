import java.util.Scanner;


public class Problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        Problem1 problem1 = new Problem1();

        int min = problem1.findMin(arr);
        System.out.println(min);
    }
    public int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;

    }
}
