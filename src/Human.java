/**
 * Created by bohdaq on 16.04.15.
 */
public class Human {
   enum Gender {MALE, FEMALE}
   public static final String MALE = "male";
   public static final String FEMALE = "female";
   Gender  gender = Gender.MALE;
   boolean humanity = true;
   String name = "Adam" + MALE;
   int count;
    public Human(Gender gender, boolean humanity, String name) {
        this.gender = gender;
        this.humanity = humanity;
        this.name = name;
    }

        Long existance (){

        return System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return name;
    }
    public void recurtion (){

        ++count;
        System.out.println(count);
        if(count<5000){
            recurtion();
        }


    }
}
