package prototype;

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Prototype Pattern Test");

        Game obj1 = new Game();
        obj1.setId(1);
        obj1.setName("COD");

        Game obj2 = obj1.clone();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
