package halotroop2288.valvemod.util;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;

public class ModEntityDamageSource extends ModDamageSource
{

    @Nullable
    protected Entity damageSourceEntity;

    public ModEntityDamageSource(String damageTypeIn, @Nullable Entity damageSourceEntityIn)
    {
        super(damageTypeIn);
        this.damageSourceEntity = damageSourceEntityIn;
    }


	
}
