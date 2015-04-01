class FightingPers {
    //parts of the body
    int head = 0;
    int arms = 1;
    int chest = 2;
    int legs = 3;
    String whoLoser;

    private Pers persOne;
    private Pers persTwo;

    public FightingPers(Pers persOne, Pers persTwo) {
        this.persOne = persOne;
        this.persTwo = persTwo;
    }

    boolean fight(int persOneHits, int persOneBlocks, int persTwoHits, int persTwoBlocks){

            if(persOneHits != persTwoBlocks){
                persTwo.hitBy(persOne.getStrength());
            }
            if(persTwoHits != persOneBlocks){
                persOne.hitBy(persTwo.getStrength());
            }
            if(persOne.getHp() <= 0) {
                whoLoser = "First Pers loses";
            }
            if(persTwo.getHp() <= 0) {
                whoLoser = "Second Pers loses";
            }
            if(persTwo.getHp() <= 0 && persOne.getHp() <= 0) {
                whoLoser = "Both dirty sluts loses :-)";
            }

        if(persOne.getHp() > 0 && persTwo.getHp() > 0){
            System.out.println("Next Round.\n" + "First " + persOne + "  Second " + persTwo);

            return false;
        } else {
            System.out.println("Game Over. "+whoLoser+"\n" + "First " + persOne + "  Second " + persTwo);
            return true;
        }
    }
}
