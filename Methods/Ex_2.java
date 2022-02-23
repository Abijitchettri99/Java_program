package Methods;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args){
        System.out.println("Enter any two numbers: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        printprime(x,y);
    }

    public static boolean isprime(int n){
        for(int i = 2; i<=n/2;i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void printprime(int x, int y){
        for(int i =x; i<=y; i++)
            if(isprime(i))
                System.out.print(i + " ");
    }
}