package Code_chef;

import java.util.Scanner;

public class array_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int max=arr[0];
            int min =arr[0];

            for(int i=0;i<arr.length;i++){
                max = Math.max(arr[i], max);
                min = Math.min(arr[i], min);
            }
            System.out.println("max="+max);
            System.out.println("min="+min);
            System.out.println(max-min);
        }
    }
}
