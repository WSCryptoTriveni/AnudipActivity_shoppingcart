package shopping_cart_activity;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart{

    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Shopping Cart !");

        // Allow user to add up to 5 items to the cart
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter item " + i + " to add to cart: ");
            String item = scanner.nextLine();
            cart.add(item);
        }

        // Print out the items in the cart
        System.out.println("\nItems in your shopping cart:");
        for (String item : cart) {
            System.out.println("- " + item);
            
        }
        scanner.close();
    }
}
