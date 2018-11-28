package com.dmr.bb.Weapons;

import com.badlogic.gdx.graphics.Texture;

public class BeamCannon extends Weapon {
    private int damage;
    private float cooldown;
    private float lastBeamShot;

    public BeamCannon(Texture tex){
        super("Beam Cannon", tex, 25, 0, 300000000);
        damage = 25;
        cooldown = 300000000;
    }
}