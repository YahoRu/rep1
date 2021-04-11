package day11.task2;

public class Magician extends Hero implements MagicAttack {

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicAtt = 20;
        magicDef = 0.8;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                ", magicAtt=" + magicAtt +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackDamage = magicAtt - (hero.magicDef * magicAtt);
        if (hero.health - attackDamage < 0) {
            hero.health = MIN_HEALTH;
        } else hero.health -= attackDamage;
    }
}
