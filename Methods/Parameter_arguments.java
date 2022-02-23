package Methods;


import com.sun.security.jgss.GSSUtil;
//paramaters: the variable declared x and y
//arguments: the value passed to x and y , here 1 is passed to x so 1 is argument
public class Parameter_arguments {
    public static void main(String[] args) {
        int x =1;                  //Here the original value of x will ne be affected since x is local var to this method
        increment(x);
        System.out.println(x);
    }
    public static void increment(int x){    //since x is just passing argument by value
      x++;
      System.out.println(x);
    }
}
