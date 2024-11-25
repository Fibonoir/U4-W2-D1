package esercizioUno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;


public class ArrayExample {
    public static void main(String[] args) {

        final Logger LOGGER = LoggerFactory.getLogger(ArrayExample.class);

        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        Scanner scanner = new Scanner(System.in);
        int position, value;

        while (true) {
            printArray(array);
            System.out.println("Enter a position to change (0 to exit): ");
            position = scanner.nextInt();
            if (position == 0) {
                break;
            }

            System.out.println("Enter a value: ");
            value = scanner.nextInt();
            try {
                array[position] = value;
            } catch (ArrayIndexOutOfBoundsException e) {
                LOGGER.error("Invalid position");
            }
        }

        scanner.close();
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
}
