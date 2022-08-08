import java.util.Random;

public class DnDCharacter {
    //strength, dexterity, constitution, intelligence, wisdom and charisma.
    private int strength = 0;
    private int dexterity = 0;
    private int constitution = 0;
    private int intelligence = 0;
    private int wisdom = 0;
    private int charisma = 0;
    private int hitpoints = 0;

    private static final int initialHitpoints = 10;

    DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        //this.hitpoints = getHitpoints();
    }

    int ability() {
        Random random = new Random();

        return random.ints(4, 1, 7).sorted().skip(1).sum();
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int modifier(int input) {

        return Math.floorDiv(input - 10, 2);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getStrength() {
        return strength;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getDexterity() {
        return dexterity;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getConstitution() {
        return constitution;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getIntelligence() {
        return intelligence;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getWisdom() {
        return wisdom;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getCharisma() {
        return charisma;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getHitpoints() {

        return 10 + modifier(constitution);

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {
        DnDCharacter dnDCharacter = new DnDCharacter();
        System.out.println(dnDCharacter.modifier(1));
    }
}
