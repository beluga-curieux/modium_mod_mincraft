package fr.belugaCurieux.flashy.datagen;

import fr.belugaCurieux.flashy.Flashy;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Flashy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generators = event.getGenerator();
        PackOutput packOutput = generators.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generators.addProvider(true, new ModRecipeProvider(packOutput));
        generators.addProvider(true, ModLootTableProvider.create(packOutput));
        generators.addProvider(true, new ModBlockStateProvider(packOutput, existingFileHelper ));
        generators.addProvider(true, new ModItemModelProvider(packOutput, existingFileHelper ));


    }

}
