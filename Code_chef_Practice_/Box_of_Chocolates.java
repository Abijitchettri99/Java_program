package Code_chef;
import java.util.Scanner;
public class Box_of_Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = arr[0];
            int firstmax=0;
            int lastmax=0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if(max<arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println("max="+max);
            for(int i=0;i<arr.length;i++){
                if(max<arr[i]) {
                    max = arr[i];
                    firstmax=i;
                }

            }
            System.out.println("firstmax= "+firstmax);
            for(int i= arr.length-1;i>0;i--){
                if(max<arr[i]) {
                    max = arr[i];
                    lastmax=i;
                }
            }
            System.out.println("Lastmax="+lastmax);
            int no_of_moves= ((arr.length)/2)-firstmax;
            int no_of_swaps = (arr.length-1)-lastmax;
            if(no_of_moves<no_of_swaps)
                System.out.println(no_of_swaps);
            else
                System.out.println(0);
        }
    }
}
