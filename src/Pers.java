public class Pers {

    private int hp;
    private int strength;
    private int armor;

    public Pers(int hp, int strength, int armor) {
        this.hp = hp;
        this.strength = strength;
        this.armor = armor;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void hitBy(int strength) {
        this.hp = this.hp - strength + armor;
    }

    @Override
    public String toString() {
        return "Pers HP:" + this.hp;
    }
}
