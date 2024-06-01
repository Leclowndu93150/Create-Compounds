package com.leclowndu93150.createcompounds;

import com.leclowndu93150.createcompounds.compounds.ChromaticCompoundColor;
import com.leclowndu93150.createcompounds.compounds.ChromaticCompoundItem;
import com.leclowndu93150.createcompounds.compounds.RefinedRadianceItem;
import com.leclowndu93150.createcompounds.compounds.ShadowSteelItem;
import com.simibubi.create.foundation.data.AssetLookup;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Rarity;

import static com.leclowndu93150.createcompounds.CompoundsMain.REGISTRATE;


public class ItemRegistry {

    public static final ItemEntry<ChromaticCompoundItem> CHROMATIC_COMPOUND =
            REGISTRATE.item("chromatic_compound", ChromaticCompoundItem::new)
                    .properties(p -> p.rarity(Rarity.UNCOMMON))
                    .model(AssetLookup.existingItemModel())
                    .color(() -> ChromaticCompoundColor::new)
                    .register();

    public static final ItemEntry<ShadowSteelItem> SHADOW_STEEL = REGISTRATE.item("shadow_steel", ShadowSteelItem::new)
            .properties(p -> p.rarity(Rarity.UNCOMMON))
            .register();

    public static final ItemEntry<RefinedRadianceItem> REFINED_RADIANCE =
            REGISTRATE.item("refined_radiance", RefinedRadianceItem::new)
                    .properties(p -> p.rarity(Rarity.UNCOMMON))
                    .register();


    public static void register() {}

}