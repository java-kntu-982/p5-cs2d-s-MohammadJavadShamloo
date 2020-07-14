package ir.ac.kntu.cs2d.GameLogics.Soldiers;

import ir.ac.kntu.cs2d.GameLogics.Guns.Bomb.Bomb;
import ir.ac.kntu.cs2d.GameLogics.Guns.GunClass.Gun;
import ir.ac.kntu.cs2d.GameLogics.Guns.Knife.Knife;

public class Soldier {
    private String name;
    private float damage;
    private float money;
    private Knife knife;
    private Gun handGun;
    private Gun rifle;
    private Bomb bomb;

    public Soldier(String name, float damage, float money, Knife knife, Gun handGun, Gun rifle, Bomb bomb) {
        this.name = name;
        this.damage = damage;
        this.money = money;
        this.knife = knife;
        this.handGun = handGun;
        this.rifle = rifle;
        this.bomb = bomb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Knife getKnife() {
        return knife;
    }

    public void setKnife(Knife knife) {
        this.knife = knife;
    }

    public Gun getHandGun() {
        return handGun;
    }

    public void setHandGun(Gun handGun) {
        this.handGun = handGun;
    }

    public Gun getRifle() {
        return rifle;
    }

    public void setRifle(Gun rifle) {
        this.rifle = rifle;
    }

    public Bomb getBomb() {
        return bomb;
    }

    public void setBomb(Bomb bomb) {
        this.bomb = bomb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soldier)) return false;

        Soldier soldier = (Soldier) o;

        if (Float.compare(soldier.getDamage(), getDamage()) != 0) return false;
        if (Float.compare(soldier.getMoney(), getMoney()) != 0) return false;
        if (getName() != null ? !getName().equals(soldier.getName()) : soldier.getName() != null) return false;
        if (getKnife() != null ? !getKnife().equals(soldier.getKnife()) : soldier.getKnife() != null) return false;
        if (getHandGun() != null ? !getHandGun().equals(soldier.getHandGun()) : soldier.getHandGun() != null)
            return false;
        if (getRifle() != null ? !getRifle().equals(soldier.getRifle()) : soldier.getRifle() != null) return false;
        return getBomb() != null ? getBomb().equals(soldier.getBomb()) : soldier.getBomb() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getDamage() != +0.0f ? Float.floatToIntBits(getDamage()) : 0);
        result = 31 * result + (getMoney() != +0.0f ? Float.floatToIntBits(getMoney()) : 0);
        result = 31 * result + (getKnife() != null ? getKnife().hashCode() : 0);
        result = 31 * result + (getHandGun() != null ? getHandGun().hashCode() : 0);
        result = 31 * result + (getRifle() != null ? getRifle().hashCode() : 0);
        result = 31 * result + (getBomb() != null ? getBomb().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", money=" + money +
                ", knife=" + knife +
                ", handGun=" + handGun +
                ", rifle=" + rifle +
                ", bomb=" + bomb +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
