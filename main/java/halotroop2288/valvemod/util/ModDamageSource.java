package halotroop2288.valvemod.util;

import halotroop2288.valvemod.entities.EntityEnergyBall;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;

public class ModDamageSource extends DamageSource
{

	public ModDamageSource(String damageTypeIn) {
		super(damageTypeIn);
	}

	public static final DamageSource VAPORIZED = (new DamageSource("vaporized")).setFireDamage();
	
	public static DamageSource causeVaporized(EntityEnergyBall entity)
    {
        return new EntityDamageSource("energy_ball", entity);
    }

}
