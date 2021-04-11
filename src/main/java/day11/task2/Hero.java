package day11.task2;

public abstract class Hero implements PhysAttack {

    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;
    int health;
    int physAtt;
    int magicAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = MAX_HEALTH;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackDamage = physAtt - (physAtt * hero.physDef);
        if (hero.health - attackDamage < 0) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackDamage;
        }
    }
}
