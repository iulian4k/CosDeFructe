package Fructe;
import java.util.ArrayList;

/**
 *
 */
public class Fruct {

    private String name;
    private double weight;
    private double price;
    private TaraProducere taraProducere;

    /**
     *
     */
    public Fruct(){
        this("Unknown", 0d, 0d, new TaraProducere("Moldova", "OrheiVit"));
    }

    /**
     * @param name The name of the fruit
     * @param weight The weight of te fruit
     * @param price The price of the fruit per kg
     * @param taraProducere The country from which the product is
     */
    public Fruct(String name, double weight, double price, TaraProducere taraProducere) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.taraProducere = taraProducere;
    }

    /**
     * @return This returns the name of the fruit
     */
    public String getName() {
        return name;
    }

    /**
     * @return This return the weight of the fruit
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @return This returns the price of the fruit
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return This returns the caountry of the fruit
     */
    public TaraProducere getTaraProducere() {
        return taraProducere;
    }

    /**
     * @param name The name of the fruit
     * @param weight The weight of te fruit
     * @param price The price of the fruit per kg
     * @param taraProducere The country from which the product is
     * @return This returns a new object of type Fruit
     */
    public static Fruct createFruct(String name, double weight, double price, TaraProducere taraProducere){
        return new Fruct(name, weight, price,  taraProducere);
    }

    /**
     * @return This returns a string with fruit's info
     */
    @Override
    public String toString(){
        return "Name >> " + getName() + "\tPrice>> " + getPrice() + " lei/kg\tWeight>> " + getWeight() +
                "\tTara producere>> " + taraProducere.getDenumire() +
                "\tImportator>> " + taraProducere.getDenumireCompanie();
    }
}
