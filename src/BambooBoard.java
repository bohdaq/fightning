public class BambooBoard implements Blackboard {
    @Override
    public void paint() {
        System.out.println("Painting on a bambooboard");
    }

    @Override
    public void erase() {
        System.out.println("Erasing bambooboard");
    }
}
