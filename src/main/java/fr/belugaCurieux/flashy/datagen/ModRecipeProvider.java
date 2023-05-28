package fr.belugaCurieux.flashy.datagen;

import fr.belugaCurieux.flashy.block.ModBlocks;
import fr.belugaCurieux.flashy.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
        public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.MODIUM_INGOT.get(),
                RecipeCategory.MISC, ModBlocks.MODIUM_BLOCK.get());
    }
}
