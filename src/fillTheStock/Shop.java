package fillTheStock;

public class Shop {


    Tomato tomatoOnShelves;

    // Tomato tomatoOnShelves = new Tomato("tomatoOnShelves", "black", 0, "kg", 0.5, "black", true);

    public Shop(double quantity) {
        this.tomatoOnShelves = new Tomato("tomatoOnShelves", "black", 0, "kg", 0.5, "black", true);
        this.tomatoOnShelves.setQuantity(quantity);
    }
}
