package src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        System.out.println("To prepare a coffee, lets first grab a cup");
        System.out.println(Cup.getInstance());
        System.out.println("Now we can cook there coffee, choose among espresso, latte, cappuccino, mocco and cacao");
        String option;
        Scanner scanner = new Scanner(System.in);
        option = scanner.next();
        switch (option){
            case ("espresso"):
                System.out.println(Espresso.cook());
                break;
            case ("cappuccino"):
                System.out.println(Cappuccino.cook());
            case ("cacao"):
                System.out.println(Cacao.cook());
            case ("mocco"):
                System.out.println(Mocco.cook());
        }
        System.out.println("Enjoy your drink!");

    }
}
