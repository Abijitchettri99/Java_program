package Methods;

public class m_overloading {
    public static void main(String[] args) {
        //System.out.println(sum(1,2,6));
        //System.out.println(sum(3,3, 3));
        sayhi();
        sayhi("NESO");
        System.out.println(sayhi1("HELLO "));
    }

    public static int sum(int x, int y){

        return x+y;
    }
    public static int sum(int x, int y, int z){

        return x +y + z;
    }

    public static void sayhi(){
        System.out.println("Hi");
    }
    public static void sayhi(String name){
        System.out.println("Hi " + name);
    }
    public static String sayhi1(String name){  //method overloading can have different return type and must have different
                                            //parameters "sayhi(), sayhi()" same parameters name will give error
        return "Hi " + name;
    }

}
