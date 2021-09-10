import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Input the nth term for the Fibonacci Sequence: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("Sequence number is " + fib(n));
    }

    public static int fib (int n){

        int first = 0;
        int second = 1;
        int temp;

        for(int i = 0; i<n; i++){
            temp = second;
            second = second + first;
            first = temp;

        }

        return first;
    }
}
