package Test;

import Fructe.Fruct;
import Fructe.TaraProducere;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 */
public class Test {

    private static Scanner scanner = new Scanner(System.in);
    //creem cosul cu fructe
    /**
     *
     */
    public static CosFructe cosFructe = new CosFructe(11);

    /**
     * @param args This is the "main method"
     */
    public static void main(String[] args) {

        //foloseste exceptii mai concrete, dar nu la general
        //clase generice

        boolean quit = false;
        //meniul
        menu();
        while (!quit) {
            //System.out.println("Introdu 7) pentru a vedea optiunile");
            System.out.print("Alege o optiune >> ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0 -> {
                    System.out.println("Iesire...");
                    quit = true;
                }
                case 1 -> {
                    cosFructe.displayFruits();
                }

                case 2 -> {
                    addNewFruit();
                }

                case 3 -> {
                    System.out.println("\t1) Sortare ascendenta\n\t2) Sortare descendenta");
                    System.out.print("Alege o optiune >> ");
                    option = scanner.nextInt();
                    scanner.nextLine();
                    if (option == 1) {
                        cosFructe.sortAscendent();
                    } else {
                        cosFructe.sortDescendent();
                    }
                }

                case 4 -> {
                    findFruitDiapazon();
                }

                case 5 -> {
                    cosFructe.calculateWeightPrice();
                }

                case 7 -> {
                    menu();
                }

            }
        }
    }

    private static void addNewFruit(){
        System.out.print("Introdu numele fructului >> ");
        String name1 = scanner.nextLine();
        System.out.print("Introdu greutatea in kg >> ");
        double weight1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Introdu pretul pentru un kg >> ");
        double price1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Tara de producere >> ");
        String tara = scanner.nextLine();
        System.out.print("Importator >> ");
        String importator = scanner.nextLine();

        Fruct newFruct = Fruct.createFruct(name1, weight1, price1, new TaraProducere(tara, importator));

        if(cosFructe.addNewFruit(newFruct)){
            System.out.println(name1 + " a fost adaugat in cos");
        }
        else{
            System.out.println("Acest fruct este deja in cos");
        }
    }

    /**
     *
     */
    public static void findFruitDiapazon(){
        System.out.println("Introdu diapazonul de preturi");
        System.out.println("pret minim > ");
        double pretMin = Double.parseDouble(scanner.nextLine());
        System.out.println("pret maxim > ");
        double pretMax = Double.parseDouble(scanner.nextLine());

        cosFructe.findFruitDiapazon(pretMin, pretMax);
    }

    private static void menu(){
        System.out.println("----- Menu ----\n" +
                "\t0) Iesire\n" +
                "\t1) Afiseaza fructele din cos\n" +
                "\t2) Adauga un fruct in cos\n" +
                "\t3) Sortați fructele\n" +
                "\t4) Fructe intr-un diapazon de pret\n" +
                "\t5) Calculati greutatea si pretul\n" +
                "\t6) Afiseaza optiunile");
        //System.out.println("Alege o optiune >> ");
    }

}



