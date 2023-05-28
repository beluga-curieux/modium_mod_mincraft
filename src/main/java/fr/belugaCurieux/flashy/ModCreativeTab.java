package fr.belugaCurieux.flashy;

import fr.belugaCurieux.flashy.block.ModBlocks;
import fr.belugaCurieux.flashy.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Flashy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTab {
    public static CreativeModeTab ITEMS_TAB;
    public static CreativeModeTab BLOCKS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        ITEMS_TAB = event.registerCreativeModeTab(new ResourceLocation(Flashy.MOD_ID, "flashy_items"),
                builder -> builder.icon(() -> new ItemStack(
                        ModItems.MODIUM_INGOT.get())).title(Component.translatable("creativemodtab.flashy_items")));

        BLOCKS_TAB = event.registerCreativeModeTab(new ResourceLocation(Flashy.MOD_ID, "flashy_blocks"),
                builder -> builder.icon(() -> new ItemStack(
                        ModBlocks.MODIUM_BLOCK.get())).title(Component.translatable("creativemodtab.flashy_blocks")));
    }

}