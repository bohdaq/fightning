import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let the combat begin. ");
        Pers persOne = new Pers(10, 4, 1);
        Pers persTwo = new Pers(10, 3, 2);

        FightingPers fp = new FightingPers(persOne, persTwo);


        boolean endOfGame = false;

        while(!endOfGame){
            System.out.println("Pers One Hits [0-4]:");
            int persOneHits = scanner.nextInt();

            System.out.println("Pers One Blocks [0-4]:");
            int persOneBlocks = scanner.nextInt();

            System.out.println("Pers Two Hits [0-4]:");
            int persTwoHits = scanner.nextInt();

            System.out.println("Pers Two Blocks [0-4]:");
            int persTwoBlocks = scanner.nextInt();

            endOfGame = fp.fight(persOneHits, persOneBlocks, persTwoHits, persTwoBlocks);
        }


    }
}
