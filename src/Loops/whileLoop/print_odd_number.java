package Loops.whileLoop;
import java.util.Scanner;
public class print_odd_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        int num = 1;
        while(num <= n){
            System.out.println(num);
            num = num + 2;
        }
    }
}
