package org.example.app.controllerz;

import org.example.app.model.ReadModel;
import org.example.app.utils.Validator;

import java.util.Scanner;
import static java.lang.System.exit;
public class Controller {

    static Scanner sc = new Scanner(System.in);

    public void appController() {

        menuItem();

    }

    public void menuItem() {

        System.out.println("\nWelcome Clothes-shop!\n");

        System.out.println("""
                Clothes selection: (1)
                Exit: (0)
                """);

        switch (Validator.validateNumber(sc)) {
            case 1 -> menuTShirt();
            case 0 -> {
                System.out.println("\n\n>>>App close");
                exit(0);
            }
            default -> System.out.println("\nTry again:)");
        }

    }

    public void menuTShirt() {

        ReadModel readModel = new ReadModel();
        readModel.ReadData();

        ClotheOrder order = new ClotheOrder();

        System.out.println("""
                Select by name: (1)
                Select by manufacturer: (2)
                Choice by color: (3)
                Choice by size: (4)
                Choice by price: (5)
                Exit: (0)
                """);

        switch (Validator.validateNumber(sc)) {
            case 1 -> order.name();
            case 2 -> order.manufacturer();
            case 3 -> order.color();
            case 4 -> order.size();
            case 5 -> order.price();
            case 0 -> {
                System.out.println("\n\n>>>App close");
                exit(0);
            }
            default -> System.out.println("\nTry again:)");
        }
    }
}
