package homework6;

import org.w3c.dom.Node;

import java.util.Random;

public class MyHomeWorkClass {
    public static final int N_COUNT = 65;
    public static void main(String[] args) {
        Random rand = new Random();
        for (int j = 0; j < 200; j++) {

            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();

            for (int i = 0; i < N_COUNT; i++) {
                map.put((rand.nextInt(200) - 100), i);
            }
            System.out.println(map);
            System.out.println("size: " + map.size());
            System.out.println("balance: " + map.analiz());
        }
    }

//    public static int analiz(MyTreeMap int count){
//
//        return 0;
//    }
}
