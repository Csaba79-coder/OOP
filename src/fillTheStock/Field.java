package fillTheStock;


public class Field {

    Tomato tomatoFromField = new Tomato("tomatoFromField", "black", 10000, "kg", 0.5, "black", true);

    public void getHarvest(Tomato tomato, double requiredQuantity) {
        double currentQuantity = tomato.getQuantity();
        if (requiredQuantity > tomatoFromField.getQuantity()) {
            System.out.println("The requested quantity is " + Math.abs(requiredQuantity - tomatoFromField.getQuantity())
                    + " higher. We can supply you only with the amount as follows: " + tomatoFromField.getQuantity());
            tomato.setQuantity(currentQuantity + tomatoFromField.getQuantity());
            tomatoFromField.setQuantity(0);
        } else {
            tomato.setQuantity(currentQuantity + requiredQuantity);
            currentQuantity = tomatoFromField.getQuantity();
            this.tomatoFromField.setQuantity((currentQuantity - requiredQuantity));
        }
    }
}
