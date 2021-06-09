package fillTheStock;

public class Transportation {


    /**
     * responsible for quantity changes between the source and destination
     * @param source
     * @param destination
     * @param quantity
     */
    public static void goodsDelivery(Product source, Product destination, double quantity) {
        double currentQuantity = destination.getQuantity();
        if (quantity > source.getQuantity()) {
            System.out.println("The requested quantity is " + Math.abs(quantity - source.getQuantity())
                    + " higher. We can supply you only with the amount as follows: " + source.getQuantity());
            destination.setQuantity(currentQuantity + source.getQuantity());
            source.setQuantity(0);
        } else {
            destination.setQuantity(currentQuantity + quantity);
            currentQuantity = source.getQuantity();
            source.setQuantity(currentQuantity - quantity);
        }
    }
}
