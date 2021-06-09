package fillTheStock;


public class Main {

    public static void main(String[] args) {
        // Tomato tomatoBlack = new Tomato("tomato", "black", 0, "kg", 0.5, "black", true);
        Field field = new Field(10000);
        Farm farm = new Farm(1000);
        WholesalerCo wholeSalerCo = new WholesalerCo( 2000);
        Shop shop = new Shop( 500);




//        System.out.println(farm.tomatoFromFarm.getQuantity() + " " + field.tomatoFromField.getQuantity());
//        field.getHarvest(farm.tomatoFromFarm, 5000);
//        System.out.println(farm.tomatoFromFarm.getQuantity() + " " + field.tomatoFromField.getQuantity());
//
//        System.out.println(wholeSalerCo.tomatoAtWholesaler.getQuantity() + " " + farm.tomatoFromFarm.getQuantity());
//        farm.getTransportation(wholeSalerCo.tomatoAtWholesaler, 4000);
//        System.out.println(wholeSalerCo.tomatoAtWholesaler.getQuantity() + " " + farm.tomatoFromFarm.getQuantity());
//
//        System.out.println(shop.tomatoOnShelves.getQuantity() + " " + wholeSalerCo.tomatoAtWholesaler.getQuantity());
//        wholeSalerCo.getTransportationToTheShop(shop.tomatoOnShelves, 2000);
//        System.out.println(shop.tomatoOnShelves.getQuantity() + " " + wholeSalerCo.tomatoAtWholesaler.getQuantity());
//
//        System.out.println("The current amount in field: " + field.tomatoFromField.getQuantity());
//        System.out.println("The current amount in farm: " + farm.tomatoFromFarm.getQuantity());
//

        System.out.println("The current amount in field: " + field.tomatoFromField.getQuantity());
        System.out.println("The current amount in farm: " + farm.tomatoFromFarm.getQuantity());
        Transportation.goodsDelivery(field.tomatoFromField, farm.tomatoFromFarm, 5000);
        System.out.println("Take 5000 from field to farm");
        System.out.println("The current amount in field: " + field.tomatoFromField.getQuantity());
        System.out.println("The current amount in farm: " + farm.tomatoFromFarm.getQuantity());

        System.out.println("----------------------------------------------------------");

        System.out.println("The current amount in farm: " + farm.tomatoFromFarm.getQuantity());
        System.out.println("The current amount in wholesaler: " + wholeSalerCo.tomatoAtWholesaler.getQuantity());
        Transportation.goodsDelivery(farm.tomatoFromFarm, wholeSalerCo.tomatoAtWholesaler, 2000);
        System.out.println("Taking 2000 from farm to wholesaler");
        System.out.println("The current amount in farm: " + farm.tomatoFromFarm.getQuantity());
        System.out.println("The current amount in wholesaler: " + wholeSalerCo.tomatoAtWholesaler.getQuantity());

        System.out.println("----------------------------------------------------------");

        System.out.println("The current amount in wholesaler: " + wholeSalerCo.tomatoAtWholesaler.getQuantity());
        System.out.println("The current amount in the shop: " + shop.tomatoOnShelves.getQuantity());
        Transportation.goodsDelivery(wholeSalerCo.tomatoAtWholesaler, shop.tomatoOnShelves, 1000);
        System.out.println("Taking 1000 from wholesaler to shop");
        System.out.println("The current amount in wholesaler: " + wholeSalerCo.tomatoAtWholesaler.getQuantity());
        System.out.println("The current amount in the shop: " + shop.tomatoOnShelves.getQuantity());
    }
}
