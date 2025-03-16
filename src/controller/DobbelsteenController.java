package controller;

import java.util.Scanner;

/* Dit is een applicatie die herhaaldelijk een dobbelsteen gooit totdat er zes wordt gegooid.
 * Bij de start van de applicatie wordt de gebruiker gevraagd welk karakter gebruikt moet worden
 * als oog van de dobbelsteen.
 * Mvg,
 * Danny Kwant */
public class DobbelsteenController {

    // public methods

    public static int werpDobbelsteen() {
        int geworpenNummer;
        final int dobbelsteenMinOgen = 1;
        final int dobbelsteenMaxOgen = 6;

        geworpenNummer = (int) (Math.random() * (dobbelsteenMaxOgen - dobbelsteenMinOgen + 1)) + dobbelsteenMinOgen;

        return geworpenNummer;
    }

    public static void printDobbelsteen(int mpRandomNummer, char mpOogDobbelsteen) {

        switch (mpRandomNummer) {
            case 1 -> {
                System.out.println(" ");
                System.out.println("  " + mpOogDobbelsteen + "  ");
                System.out.println(" ");
                System.out.println("-----");
            }
            case 2 -> {
                System.out.println(mpOogDobbelsteen + "    ");
                System.out.println("     ");
                System.out.println("    " + mpOogDobbelsteen);
                System.out.println("-----");
            }
            case 3 -> {
                System.out.println(mpOogDobbelsteen + "    ");
                System.out.println("  " + mpOogDobbelsteen + "  ");
                System.out.println("    " + mpOogDobbelsteen);
                System.out.println("-----");
            }
            case 4 -> {
                System.out.println(mpOogDobbelsteen + "   " + mpOogDobbelsteen);
                System.out.println("     ");
                System.out.println(mpOogDobbelsteen + "   " + mpOogDobbelsteen);
                System.out.println("-----");
            }
            case 5 -> {
                System.out.println(mpOogDobbelsteen + "   " + mpOogDobbelsteen);
                System.out.println("  " + mpOogDobbelsteen + "  ");
                System.out.println(mpOogDobbelsteen + "   " + mpOogDobbelsteen);
                System.out.println("-----");
            }
            case 6 -> {
                System.out.println(mpOogDobbelsteen + "   " + mpOogDobbelsteen);
                System.out.println(mpOogDobbelsteen + "   " + mpOogDobbelsteen);
                System.out.println(mpOogDobbelsteen + "   " + mpOogDobbelsteen);
                System.out.println("-----");
            }
            default -> System.out.println("Error. Resultaat van de worp ligt buiten bereik 1 t/m 6.");

        }


    }


    public static void main(String[] args) {

        // variabelen
        char oogDobbelsteen;
        int dobbelsteenWorp;

        // scanner
        Scanner userInput = new Scanner(System.in);

        System.out.print("Welk karakter moet ik gebruiken voor het oog van jouw dobbelsteen? ");
        oogDobbelsteen = userInput.next().charAt(0);

        do {

            dobbelsteenWorp = werpDobbelsteen();
            printDobbelsteen(dobbelsteenWorp, oogDobbelsteen);

        } while (dobbelsteenWorp != 6);

    }

}
