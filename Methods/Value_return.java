package Methods;
//A method that returns a value the return type is the type of the data that will be returned.
public class Value_return {
    public static void main(String[] args) {
        System.out.println("Message 1");
        System.out.println(sum(2,5) + sum(5,7));
        System.out.println("Message 2");
        say();
    }
    public static int sum(int x , int y){
        int sum = x+y;
        return sum;
    }
    public static void say(){
        return;
       // System.out.println(" heke");   //After return method, the method will be exit, marked as unreachable state
    }
}
