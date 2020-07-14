package ir.ac.kntu.cs2d.GameLogics.Soldiers;

import ir.ac.kntu.cs2d.GameLogics.Guns.HandGun.USP;
import ir.ac.kntu.cs2d.GameLogics.Guns.Knife.Knife;

public class MateSoldiers extends Soldier{
    public MateSoldiers() {
        super("Mate", 100f, 1500f, new Knife(), new USP(), null, null);
    }
}
