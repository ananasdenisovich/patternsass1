package src;

public class Cacao extends Coffee{
    public static String cook(){
        String cooked = CoffeeBehaviour.addCaffeineWithoutCaffeine() + ", " + MilkBehaviour.addMilk();
        return cooked;
    }
}
