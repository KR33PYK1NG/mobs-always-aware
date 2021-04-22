package rmc.mixins.mobs_always_aware.actual;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.MobEntity;

/**
 * Developed by RMC Team, 2021
 */
@Mixin(value = MobEntity.class)
public abstract class MobEntityMixin {

    @Shadow public boolean aware;

    @Inject(method = "Lnet/minecraft/entity/MobEntity;updateEntityActionState()V",
            at = @At(value = "HEAD"))
    private void makeAlwaysAware(CallbackInfo mixin) {
        this.aware = true;
    }

}