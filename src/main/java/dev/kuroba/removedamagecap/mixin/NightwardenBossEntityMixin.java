package dev.kuroba.removedamagecap.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "com.gametechbc.traveloptics.entity.mobs.nightwarden_boss.NightwardenBossEntity", remap = false)
public abstract class NightwardenBossEntityMixin {

    @Inject(method = "getDamageCap", at = @At("HEAD"), cancellable = true, remap = false)
    private void removedamagecap$noCap(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(Float.MAX_VALUE);
    }
}
