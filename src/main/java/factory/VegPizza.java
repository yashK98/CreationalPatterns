package factory;

public class VegPizza implements Pizza{

    @Override
    public void getBase() {
        System.out.println("Creating Veg Pizza Base");
    }

    @Override
    public void getTopping() {
        System.out.println("Creating Veg Pizza Topping");
    }

    @Override
    public void servePizza() {
        System.out.println("Serving Veg Pizza");
    }
}
