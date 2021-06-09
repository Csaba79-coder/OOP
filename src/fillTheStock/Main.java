package fillTheStock;


public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm();
        Field field = new Field();
        WholesalerCo wholeSalerCo = new WholesalerCo();
        Shop shop = new Shop();

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
        System.out.println("The current amount in field: " + field.tomatoFromField.getQuantity());
        System.out.println("The current amount in farm: " + farm.tomatoFromFarm.getQuantity());
    }
}
