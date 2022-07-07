package org.example.app.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {

    public static String validateSTR(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.print(Constants.EMPTY_NAME_MSG);
            str = scanner.nextLine().trim();
        }
        return str;
    }


    public static double validatePrice(Scanner scanner) {

        double price;
        String str1 = null;

        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf(Constants.NAN_PRICE_MSG, str);
        }
        price = scanner.nextDouble();
        while (price <= 0) {
            System.out.print(Constants.INCORRECT_PRICE_MSG);
            while (!scanner.hasNextDouble()) {
                try {
                    str1 = scanner.nextLine().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf(Constants.NAN_PRICE_MSG, str1);
                }
            }
            price = scanner.nextDouble();
        }
        return price;
    }

    public static int validateNumber(Scanner scanner) {

        int tmp;
        String str1 = null;

        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf(Constants.NAN_NUMBER_MSG, str);
        }
        tmp = scanner.nextInt();
        while (tmp < 0) {
            System.out.print(Constants.INCORRECT_NUMBER_MSG);
            while (!scanner.hasNextDouble()) {
                try {
                    str1 = scanner.nextLine().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf(Constants.INCORRECT_NUMBER_MSG, str1);
                }
            }
            tmp = scanner.nextInt();
        }
        return tmp;
    }
}
