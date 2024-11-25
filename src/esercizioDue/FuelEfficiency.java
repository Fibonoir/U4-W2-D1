package esercizioDue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        final Logger LOGGER = LoggerFactory.getLogger(FuelEfficiency.class);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of kilometers traveled: ");
        int kilometers = scanner.nextInt();

        System.out.println("Enter the number of liters consumed: ");
        int liters = scanner.nextInt();

        try {
            int fuelEfficiency = kilometers / liters;
            System.out.println("Fuel efficiency: " + fuelEfficiency + " km/l");
        } catch (ArithmeticException e) {
            LOGGER.error("Division by zero");
        }
    }
}

