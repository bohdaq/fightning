public class Mouse {
    Mouse(){
        HeadOfMouse headOfMouse = new HeadOfMouse();
        headOfMouse.moveHead(3);
        this.sayMyName();
    }
    int type = 1;
    void sayMyName(){
        System.out.println("Walter White\n You, are right");
        new HeadOfMouse();
    }

    //local inner class
    void showDiffOfALocalInnerClass(){
        class VeryInternalMouseStuff{
            int type = 22;
        }
        new VeryInternalMouseStuff();
    }
    //nested inner class
    class HeadOfMouse{
        int type = 2;
        void moveHead(int type){

            System.out.println("Moving head" + Mouse.this.type);
            this.sayMyName();
        }
        void sayMyName(){
            System.out.println("\nWhily Wonka");
        }
    }
    //nested static class
    static class Consciousness{
        void wisdomAndGlory(){
            System.out.println("Full of wisdom and glory");
        }
    }

    void mouseIsPaintingOnABoard(Blackboard bambooBoard){
        bambooBoard.paint();
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        HeadOfMouse headOfMouse = mouse.new HeadOfMouse();

        Consciousness consciousness = new Mouse.Consciousness();

        //inner annonymous class
        Blackboard woodenBoard = new Blackboard() {
            @Override
            public void paint() {
                System.out.println("Painting on a wooden board");
            }

            @Override
            public void erase() {
                System.out.println("Erasing on a wooden board");
            }
        };
        mouse.mouseIsPaintingOnABoard(woodenBoard);
    }
}
