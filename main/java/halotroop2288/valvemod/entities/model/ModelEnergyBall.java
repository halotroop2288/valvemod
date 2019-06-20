package halotroop2288.valvemod.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Energy Ball - halotroop2288
 * Created using Tabula 7.0.1
 */
public class ModelEnergyBall extends ModelBase {
    public ModelRenderer sprite;

    public ModelEnergyBall() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.sprite = new ModelRenderer(this, 1, 1);
        this.sprite.setRotationPoint(-15.0F, -10.0F, 0.0F);
        this.sprite.addBox(0.0F, 0.0F, 0.0F, 28, 28, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.sprite.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
