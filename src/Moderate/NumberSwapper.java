package Moderate;
/*
Write a function to swap a number in place (that is without using temporary variables)
 */
import java.util.Scanner;

public class NumberSwapper {
    public static String swap(int a, int b){

        a = a - b;
        b = a + b;
        a = b - a;
        return "a: " + a + "\nb: " + b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        System.out.println(swap(a, b));
    }
}

