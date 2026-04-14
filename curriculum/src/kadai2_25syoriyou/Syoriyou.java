package kadai2_25syoriyou;

import java.util.Random;

public class Syoriyou {
    private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;

    // コンストラクタ（ランダム生成）
    public Syoriyou() {
        Random rand = new Random();
        this.hp = rand.nextInt(1000);
        this.mp = rand.nextInt(1000);
        this.attack = rand.nextInt(1000);
        this.speed = rand.nextInt(1000);
        this.defense = rand.nextInt(1000);
    }

    // getter
    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }

    // setter
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}