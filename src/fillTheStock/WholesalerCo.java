package fillTheStock;

public class WholesalerCo {


    Tomato tomatoAtWholesaler;

    // Tomato tomatoAtWholesaler = new Tomato("tomatoAtWholesaler", "black", 0, "kg", 0.5, "black", true);

    public WholesalerCo(double quantity) {
        this.tomatoAtWholesaler = new Tomato("tomatoAtWholesaler", "black", 0, "kg", 0.5, "black", true);
        this.tomatoAtWholesaler.setQuantity(quantity);
    }

    public void getTransportationToTheShop(Tomato tomato, double requiredQuantity) {
        double currentQuantity = tomato.getQuantity();
        if (requiredQuantity > tomatoAtWholesaler.getQuantity()) {
            System.out.println("The requested quantity is " + Math.abs(requiredQuantity - tomatoAtWholesaler.getQuantity())
                    + " higher. We can supply you only with the amount as follows: " + tomatoAtWholesaler.getQuantity());
            tomato.setQuantity(currentQuantity + tomatoAtWholesaler.getQuantity());
            tomatoAtWholesaler.setQuantity(0);
        } else {
            tomato.setQuantity(currentQuantity + requiredQuantity);
            currentQuantity = tomatoAtWholesaler.getQuantity();
            this.tomatoAtWholesaler.setQuantity((currentQuantity - requiredQuantity));
        }
    }
}
