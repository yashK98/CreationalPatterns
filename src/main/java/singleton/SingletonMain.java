package singleton;

public class SingletonMain {

    public static void main(String[] args) {
        System.out.println("Singleton Design Pattern");

        DbConnection connection1 = DbUtil.getInstance();
        DbConnection connection2 = DbUtil.getInstance();

        if(connection1 == connection2){
            System.out.println("Singleton Pattern Working");
        } else{
            System.out.println("Singleton Pattern incorrect implementation");
        }
    }
}
