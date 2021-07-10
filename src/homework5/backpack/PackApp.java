package homework5.backpack;

public class PackApp {
    public static void main(String[] args) {
        Backpack backpack = new Backpack(15);
        Items apple = new Items(1,1);
        Items radio = new Items(5,10);
        Items pick = new Items(10,7);
        Items thermos = new Items(5,3);
        Items matches = new Items(1,5);
        Items raincoat = new Items(3,8);
        Items ax = new Items(8,12);

        backpack.addItemsPack(apple);
        backpack.addItemsPack(radio);
        backpack.addItemsPack(pick);
        backpack.addItemsPack(thermos);
        backpack.addItemsPack(matches);
        backpack.addItemsPack(raincoat);
        backpack.addItemsPack(ax);

        System.out.println(backpack);

//        не понимаю как сделать 2 задание
    }
}
