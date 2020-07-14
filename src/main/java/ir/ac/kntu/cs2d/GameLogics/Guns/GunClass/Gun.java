package ir.ac.kntu.cs2d.GameLogics.Guns.GunClass;

public class Gun {
    private String name;
    private float price;
    private float Damage;
    private float FireTime;
    private float reloadTime;
    private float magazineCapacity;

    public Gun(String name, float price, float damage, float fireTime, float reloadTime, float magazineCapacity) {
        this.name = name;
        this.price = price;
        Damage = damage;
        FireTime = fireTime;
        this.reloadTime = reloadTime;
        this.magazineCapacity = magazineCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDamage() {
        return Damage;
    }

    public void setDamage(float damage) {
        Damage = damage;
    }

    public float getFireTime() {
        return FireTime;
    }

    public void setFireTime(float fireTime) {
        FireTime = fireTime;
    }

    public float getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(float reloadTime) {
        this.reloadTime = reloadTime;
    }

    public float getMagazineCapacity() {
        return magazineCapacity;
    }

    public void setMagazineCapacity(float magazineCapacity) {
        this.magazineCapacity = magazineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gun)) return false;

        Gun gun = (Gun) o;

        if (Float.compare(gun.getPrice(), getPrice()) != 0) return false;
        if (Float.compare(gun.getDamage(), getDamage()) != 0) return false;
        if (Float.compare(gun.getFireTime(), getFireTime()) != 0) return false;
        if (Float.compare(gun.getReloadTime(), getReloadTime()) != 0) return false;
        if (Float.compare(gun.getMagazineCapacity(), getMagazineCapacity()) != 0) return false;
        return getName() != null ? getName().equals(gun.getName()) : gun.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getPrice() != +0.0f ? Float.floatToIntBits(getPrice()) : 0);
        result = 31 * result + (getDamage() != +0.0f ? Float.floatToIntBits(getDamage()) : 0);
        result = 31 * result + (getFireTime() != +0.0f ? Float.floatToIntBits(getFireTime()) : 0);
        result = 31 * result + (getReloadTime() != +0.0f ? Float.floatToIntBits(getReloadTime()) : 0);
        result = 31 * result + (getMagazineCapacity() != +0.0f ? Float.floatToIntBits(getMagazineCapacity()) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Damage=" + Damage +
                ", FireTime=" + FireTime +
                ", reloadTime=" + reloadTime +
                ", magazineCapacity=" + magazineCapacity +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
