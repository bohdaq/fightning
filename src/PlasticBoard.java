public class PlasticBoard implements Blackboard {
    @Override
    public void paint() {
        System.out.println("Painting on a PlasticBoard");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a PlasticBoard");
    }
}
