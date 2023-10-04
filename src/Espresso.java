package src;

public class Espresso extends Coffee implements CoffeeBehaviour, MilkBehaviour{
    public static String cook(){
        String cooked = CoffeeBehaviour.addCaffeine() + ", " + MilkBehaviour.dontAddMilk();
        return cooked;
    }

}
