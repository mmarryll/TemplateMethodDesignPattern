//Проверка
public class Client {
    public static void main(String[] args) {

        System.out.println("Going to make milkshake with banana and cocoa.");

        Milkshake milkshake = new BananaAndCocoaMilkshake();
        milkshake.makeMilkshake();

        System.out.println("Milkshake with banana and cocoa is ready!");

        System.out.println("********************");

        System.out.println("Going to make milkshake with strawberries and cookies.");

        milkshake = new StrawberryAndCookiesMilkshake();
        milkshake.makeMilkshake();

        System.out.println("Milkshake with strawberry and cookies is ready!");
    }
}
