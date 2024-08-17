package xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.advancement.ModAdvancementProvider;
import xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.lang.ModLanguageProviders;
import xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.loot.ModLootTableProviders;
import xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.model.ModModelProvider;
import xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.recipe.ModRecipeProvider;
import xyz.tcbuildmc.minecraft.mod.blockycooking.fabric.data.tag.ModTagProviders;

public final class BlockCookingFabricDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        // Lang
        pack.addProvider(ModLanguageProviders.ModEnglishLanguageProvider::new);
        pack.addProvider(ModLanguageProviders.ModSimplifiedChineseLanguageProvider::new);

        // Model
        pack.addProvider(ModModelProvider::new);

        // Tag
        pack.addProvider(ModTagProviders.ModItemTagProvider::new);
        pack.addProvider(ModTagProviders.ModBlockTagProvider::new);

        // Recipe
        pack.addProvider(ModRecipeProvider::new);

        // LootTable
        pack.addProvider(ModLootTableProviders.ModBlockLootTableProvider::new);

        // Advancement
        pack.addProvider(ModAdvancementProvider::new);
    }
}