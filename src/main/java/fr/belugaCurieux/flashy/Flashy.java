package fr.belugaCurieux.flashy;

import com.mojang.logging.LogUtils;
import fr.belugaCurieux.flashy.block.ModBlocks;
import fr.belugaCurieux.flashy.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Flashy.MOD_ID)
public class Flashy
{
    public static final String MOD_ID = "flashy";
    private static final Logger LOGGER = LogUtils.getLogger();
    public Flashy()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);


        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ModCreativeTab.ITEMS_TAB) {
            event.accept(ModItems.MODIUM_INGOT);
            event.accept(ModItems.MODIUM_NUGGET);
            event.accept(ModItems.BUG);
            event.accept(ModItems.TUTO_ITEM);

        }
        if (event.getTab() == ModCreativeTab.BLOCKS_TAB) {
            event.accept(ModBlocks.MODIUM_BLOCK);
            event.accept(ModBlocks.BUGY_BLOCK);
        }
    }
    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
