package Java101.Classes.BoxingGame;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\033c");
        Fighter marc = new Fighter("Marc" , 10 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 15 , 95, 100, 0);
        Random random = new Random();
        int starter = random.nextInt(2) + 1;
        if (starter == 1) {
            Ring r = new Ring(marc, alex, 90, 100);
            r.run();
        } else{
            Ring r = new Ring(alex, marc, 90, 100);
            r.run();
        }
    }
}
