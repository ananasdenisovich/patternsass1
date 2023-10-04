package src;

public class Mocco extends Coffee{
    public static String cook(){
        String cooked = CoffeeBehaviour.addCaffeine() + ", Chocolate added" + MilkBehaviour.addMilk();
        return cooked;
    }
}
