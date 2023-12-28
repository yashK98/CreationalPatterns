package factory;

public class FactoryMain {

    public static void main(String[] args) {

        Pizza myVegPizza = PizzaFactory.getPizza("Veg Pizza");
        myVegPizza.getBase();
        myVegPizza.getTopping();
        myVegPizza.servePizza();

        Pizza myChickenPizza = PizzaFactory.getPizza("Chicken Pizza");
        myChickenPizza.getBase();
        myChickenPizza.getTopping();
        myChickenPizza.servePizza();

        Pizza randomPizza = PizzaFactory.getPizza("Random Pizza");
        if(randomPizza!=null){
            randomPizza.getBase();
            randomPizza.getTopping();
            randomPizza.servePizza();
        }
    }
}
