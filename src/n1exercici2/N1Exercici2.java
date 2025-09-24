package n1exercici2;

import java.util.Scanner;

public class N1Exercici2 {
    public static void main(String[] args) {
        byte b = ' ';
        int i = 0;
        float f = 0F;
        double d = 0.0;
        char ch = ' ';
        String s = "";
        boolean answer = false;


        try {
            b = Input.readByte("Introdueix la teva edat.");
            System.out.println("Has introduït: " + b);

            i = Input.readInt("Introdueix el teu any de naixement.");
            System.out.println("Has introduït: " + i);

            f = Input.readFloat("Introdueix la teva alçada en metres.");
            System.out.println("Has introduït: " + f);

            d = Input.readDouble("Introdueix la població actual de la ciutat de Barcelona.");
            System.out.println("Has introduït: " + d);

            ch = Input.readChar("Introdueix un sol caràcter.");
            System.out.println("Has introduït: " + ch);

            s = Input.readString("Introdueix el teu nom i cognoms.");
            System.out.println("Has introduït: " + s);

            answer = Input.readYesNo("Vius a Barcelona?\nRespon sí o no (s/n).");
            System.out.println("Has introduït: " + answer);

        }   catch (CustomException e) {
            System.out.println("S'ha produït un error: " + e.getMessage());
            }

        System.out.println("Adeu!");

    }

}
