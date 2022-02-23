package Code_chef;
import java.util.Scanner;
public class battle {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        check_even_odd(arr);

    }
    public static void check_even_odd(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                even++;
            } else
                odd++;
        }
        if(odd>even || odd==even)
            System.out.println("Not ready");
        else
            System.out.println("Ready for battle");
    }
}
