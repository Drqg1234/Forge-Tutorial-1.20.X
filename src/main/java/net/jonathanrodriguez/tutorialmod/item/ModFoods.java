package net.jonathanrodriguez.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).fast().saturationMod(.2f).effect(()
            -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), .1f).build();
}
