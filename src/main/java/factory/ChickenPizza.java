package factory;

public class ChickenPizza implements Pizza{

    @Override
    public void getBase() {
        System.out.println("Creating Chicken Pizza Base");
    }

    @Override
    public void getTopping() {
        System.out.println("Creating Chicken Pizza Topping");
    }

    @Override
    public void servePizza() {
        System.out.println("Serving Chicken Pizza");
    }
}
