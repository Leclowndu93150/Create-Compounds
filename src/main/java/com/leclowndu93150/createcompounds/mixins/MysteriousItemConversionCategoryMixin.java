package com.leclowndu93150.createcompounds.mixins;

import com.simibubi.create.AllItems;
import com.simibubi.create.compat.jei.ConversionRecipe;
import com.simibubi.create.compat.jei.category.MysteriousItemConversionCategory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = MysteriousItemConversionCategory.class,remap = false)
public class MysteriousItemConversionCategoryMixin {

    @Inject(method = "<clinit>",at = @At("RETURN"))
    private static void inject(CallbackInfo ci){
        MysteriousItemConversionCategory.RECIPES.add(ConversionRecipe.create(AllItems.CHROMATIC_COMPOUND.asStack(), AllItems.SHADOW_STEEL.asStack()));
        MysteriousItemConversionCategory.RECIPES.add(ConversionRecipe.create(AllItems.CHROMATIC_COMPOUND.asStack(), AllItems.REFINED_RADIANCE.asStack()));
    }

}
