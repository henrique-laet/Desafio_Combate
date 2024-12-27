package entities;

import javax.print.attribute.standard.MediaSize;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public void takeDamage(Champion other) {
        int dano = Math.max(1, other.attack - this.armor);

        this.life = Math.max(0, this.life - dano);
    }

    public String status() {
        if (this.life <= 0) {
            return this.name + ": 0 de vida (morreu)";
        }
        return this.name + ": " + this.life + " de vida";
    }


}
