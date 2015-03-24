public class Main {

    public static void main(String[] args) {
        System.out.println("Let the combat begin. ");
        Pers persOne = new Pers(10, 4, 1);
        Pers persTwo = new Pers(10, 3, 2);

        FightingPers fp = new FightingPers(persOne, persTwo);


        boolean endOfGame = false;

        while(!endOfGame){
            System.out.println("Pers One Hits [0-4]:");
            int persOneHits = Integer.parseInt(System.console().readLine());

            System.out.println("Pers One Blocks [0-4]:");
            int persOneBlocks = Integer.parseInt(System.console().readLine());

            System.out.println("Pers Two Hits [0-4]:");
            int persTwoHits = Integer.parseInt(System.console().readLine());

            System.out.println("Pers Two Blocks [0-4]:");
            int persTwoBlocks = Integer.parseInt(System.console().readLine());

            endOfGame = fp.fight(persOneHits, persOneBlocks, persTwoHits, persTwoBlocks);
        }


    }
}
