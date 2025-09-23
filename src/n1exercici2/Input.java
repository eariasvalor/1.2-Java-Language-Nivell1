package n1exercici2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        byte value = 0;
        boolean correct = false;

        while (!correct) {
            try{
                System.out.println(message + ": ");
                value = scanner.nextByte();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format.");

            }
        }
        return value;
    }

    public static int readInt(String message) {
        int value = 0;
        boolean correct = false;

        while (!correct) {
            try {
                System.out.println(message + ": ");
                value = scanner.nextInt();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                scanner.nextLine();
            }
        }

        return value;
    }

    public static float readFloat(String message) {
        float value = 0.0F;
        boolean correct = false;

        while (!correct) {
            try {
                System.out.println(message + ": ");
                value = scanner.nextFloat();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                scanner.nextLine();
            }
        }

        return value;
    }

    public static double readDouble(String message) {
        double value = 0.0;
        boolean correct = false;

        while (!correct) {
            try {
                System.out.println(message + ": ");
                value = scanner.nextDouble();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                scanner.nextLine();
            }
        }

        return value;
    }



}
