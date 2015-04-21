/**
 * Created by bohdaq on 16.04.15.
 */
public class World {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(getTime());
       // Thread.sleep(2000);
        System.out.println(chik);
        System.out.println(chik.humanity);
        chik.recurtion();
    }
    static long time = System.currentTimeMillis();
    static long getTime(){
        return System.currentTimeMillis();
    }

    static Human chik = new Human(Human.Gender.FEMALE, true, "Eve");

}
