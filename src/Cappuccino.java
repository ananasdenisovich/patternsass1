package src;

public class Cappuccino extends Coffee{
    public static String cook(){
        String cooked = CoffeeBehaviour.addCaffeine() + ", " + CoffeeBehaviour.addCaffeine() + ", " + MilkBehaviour.addMilk();
        return cooked;
    }
}
