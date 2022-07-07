package org.example.app.view;

import org.example.app.utils.Validator;

import java.util.Scanner;
public class ViewItem {

    static Scanner sc = new Scanner(System.in);

    static String title;


    public static String choiceName() {
        title = "Enter Name: ";
        System.out.println(title);
        return Validator.validateSTR(sc);
    }

    public static String choiceManufacturer() {
        title = "Enter Manufacturer: ";
        System.out.println(title);
        return Validator.validateSTR(sc);

    }

    public static String choiceColor() {
        title = "Enter Color: ";
        System.out.println(title);
        return Validator.validateSTR(sc);
    }

    public static String choiceSize() {
        title = "Enter Size: ";
        System.out.println(title);
        return Validator.validateSTR(sc);
    }

    public static double choicePrice() {
        title = "Enter Price: ";
        System.out.println(title);
        return Validator.validatePrice(sc);
    }

}
