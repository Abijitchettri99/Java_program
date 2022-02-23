package Methods;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        System.out.print("Enter your name: " );
        System.out.println(names());
        System.out.println("Enter your age: ");
        System.out.println(age());
    }
    public static String names(){

        return new Scanner(System.in).nextLine();
    }
    public static int age(){

        return new Scanner(System.in).nextInt();
    }
}


   /* public static String names(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        return name;
    }
    or public static String name(){
        return new Scanner(System.in).nextLine();
    }
    public static int age(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        return age;
    }
    or public static int age(){
        return new Scanner(System.in).nextInt;
    }
}*/
