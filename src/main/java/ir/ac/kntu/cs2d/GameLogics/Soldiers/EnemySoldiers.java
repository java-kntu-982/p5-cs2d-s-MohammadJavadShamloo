package ir.ac.kntu.cs2d.GameLogics.Soldiers;

import ir.ac.kntu.cs2d.GameLogics.Guns.HandGun.Glock;
import ir.ac.kntu.cs2d.GameLogics.Guns.Knife.Knife;

public class EnemySoldiers extends Soldier {
    public EnemySoldiers() {
        super("Enemy", 100f, 1500f, new Knife(), new Glock(), null, null);
    }
}
