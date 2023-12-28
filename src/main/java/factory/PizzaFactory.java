package factory;

public class PizzaFactory {

    public static Pizza getPizza(String pizza){
        if(pizza.equalsIgnoreCase("Chicken Pizza")){
            return new ChickenPizza();
        }else if(pizza.equalsIgnoreCase("Veg Pizza")){
            return new VegPizza();
        }else{
            System.out.println("Invalid Input");
            return null;
        }
    }
}
