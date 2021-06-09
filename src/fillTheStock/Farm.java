package fillTheStock;

public class Farm {

    Tomato tomatoFromFarm = new Tomato("tomato", "black", 1000, "kg", 0.5, "black", true);


    public void getTransportation(Tomato tomato, double requiredQuantity) {
        double currentQuantity = tomato.getQuantity();
        if (requiredQuantity > tomatoFromFarm.getQuantity()) {
            System.out.println("The requested quantity is " + Math.abs(requiredQuantity - tomatoFromFarm.getQuantity())
                    + " higher. We can supply you only with the amount as follows: " + tomatoFromFarm.getQuantity());
            tomato.setQuantity(currentQuantity + tomatoFromFarm.getQuantity());
            tomatoFromFarm.setQuantity(0);
        } else {
            tomato.setQuantity(currentQuantity + requiredQuantity);
            currentQuantity = tomatoFromFarm.getQuantity();
            this.tomatoFromFarm.setQuantity((currentQuantity - requiredQuantity));
        }
    }
}
