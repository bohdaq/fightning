class FightingPers {
    //parts of the body
    int head = 0;
    int arms = 1;
    int chest = 2;
    int legs = 3;

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
            if(persOne.getHp() <= 0)

        if(persOne.getHp() > 0 && persTwo.getHp() > 0){
            System.out.println("Next Round.\n" + "1 " + persOne + "  2 " + persTwo);

            return false;
        } else {
            System.out.println("Game Over.\n" + "1 " + persOne + "  2 " + persTwo);
            return true;
        }
    }
}
