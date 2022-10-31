abstract class Fighter {

    boolean isVulnerable() {
        return false;
        //throw new UnsupportedOperationException("Please provide implementation for this method");
    }

    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
        //throw new UnsupportedOperationException("Please implement the toString() method with the required text");
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
        //throw new UnsupportedOperationException("Please implement the toString() method with the required text");
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
        //throw new UnsupportedOperationException("Please implement Warrior.damagePoints() method");
    }
}

class Wizard extends Fighter {
    private boolean preapringSpell = false;

    @Override
    boolean isVulnerable() {
        return !this.preapringSpell;
        //throw new UnsupportedOperationException("Please implement Wizard.isVulnerable() method");
    }

    @Override
    int damagePoints(Fighter warrior) {
        return this.preapringSpell ? 12 : 3;
        //throw new UnsupportedOperationException("Please implement Wizard.damagePoints() method");
    }

    void prepareSpell() {
        this.preapringSpell = true;
        //throw new UnsupportedOperationException("Please implement Wizard.prepareSpell() method");
    }

}
