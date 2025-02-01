package net.jonathanrodriguez.tutorialmod.item;

import net.jonathanrodriguez.tutorialmod.TutorialMod;
import net.jonathanrodriguez.tutorialmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5, 4f, 25,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(TutorialMod.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());

//    public static final Tier CUSTOM = TierSortingRegistry.registerTier(
//            new ForgeTier(5, 2000, 3, 6f, 25,
//                    ModTags.Blocks.GREATSWORD, () -> )
//    )

}
