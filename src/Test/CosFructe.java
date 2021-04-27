package Test;

import Fructe.Fruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/**
 *
 */
public class CosFructe {

    private int nrCos;
    private ArrayList<Fruct> cosFructe;

    /**
     * @param nrCos This is the number of cart
     */
    public CosFructe(int nrCos) {
        this.nrCos = nrCos;
        this.cosFructe = new ArrayList<Fruct>();
    }

    /**
     * @param fruct Object of type Fruct
     * @return Returns a boolean expresion if a new fruit was added
     */
    public boolean addNewFruit(Fruct fruct){
        //se verifica daca fructul exista in cos
        if(findFruit(fruct) >= 0){
            System.out.println("Acest fruct deja exista in cos!");
            return false;
        }

        cosFructe.add(fruct);
        return true;
    }

    /**
     * @param fruct Object of type Fruct
     * @return Returns the index of an object of type fruit
     */
    //aceasta metoda returneaza indicile Fructului
    public int findFruit(Fruct fruct){
        return this.cosFructe.indexOf(fruct);
    }

    /**
     * This method calculates the total weight and price
     */
    public void calculateWeightPrice(){
        double pretTotal = 0d;
        double greutateTotala = 0d;

        for(Fruct i : cosFructe){
            greutateTotala += i.getWeight();
        }

        for(Fruct i : cosFructe){
            pretTotal += i.getPrice() * i.getWeight();
        }


        System.out.println("Pretul total >> " + pretTotal + " lei\nGreutate totala " + greutateTotala + " kg");
    }

    /**
     * @param pretMin the minimal price in the range
     * @param pretMax the maximal price in the range
     */
    public void findFruitDiapazon(double pretMin, double pretMax){
        //fructe dintrun diapazon de preturi
        for(Fruct i : cosFructe){
            if(i.getPrice() > pretMin && i.getPrice() < pretMax){
                System.out.println("Nume >> " + i.getName() +
                        "\tPrice>> " + i.getPrice() + " lei/kg\tWeight>> " + i.getWeight());
            }
        }
    }

    /**
     *
     */
    public void displayFruits(){
        System.out.println("Lista de fructe din cos");
        for(int i = 0; i < this.cosFructe.size(); ++i){
            System.out.println((i + 1) + ". Name >> " + this.cosFructe.get(i).getName() +
                    "\tPrice>> " + this.cosFructe.get(i).getPrice() +
                    "lei/kg\tWeight>> " + this.cosFructe.get(i).getWeight());
        }

    }

    /**
     * This method is for sorting ascendent
     */
    public void sortAscendent(){
        cosFructe.sort(Comparator.comparing(Fruct::getWeight));
    }

    /**
     * This method is for sorting descendent
     */
    public void sortDescendent(){
        cosFructe.sort(Comparator.comparing(Fruct::getWeight)
                .reversed()
                .thenComparing(Comparator.comparing(Fruct::getWeight).reversed()));
    }

}
