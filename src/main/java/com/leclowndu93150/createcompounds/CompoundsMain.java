package com.leclowndu93150.createcompounds;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.AllItems;
import com.simibubi.create.compat.jei.ConversionRecipe;
import com.simibubi.create.compat.jei.category.MysteriousItemConversionCategory;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


@Mod(CompoundsMain.MODID)
public class CompoundsMain {

    public static final String MODID = "createcompounds";

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MODID);

    private static final DeferredRegister<CreativeModeTab> TAB_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = TAB_REGISTER.register("tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("Create: Compounds"))
                    .withTabsBefore(AllCreativeModeTabs.BASE_CREATIVE_TAB.getKey())
                    .icon(AllItems.REFINED_RADIANCE::asStack)
                    .displayItems((parameters, output) -> {
                        output.accept(AllItems.CHROMATIC_COMPOUND.get());
                        output.accept(AllItems.REFINED_RADIANCE.get());
                        output.accept(AllItems.SHADOW_STEEL.get());
                    })
                    .build());

    public CompoundsMain() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //REGISTRATE.registerEventListeners(FMLJavaModLoadingContext.get().getModEventBus());
        TAB_REGISTER.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
