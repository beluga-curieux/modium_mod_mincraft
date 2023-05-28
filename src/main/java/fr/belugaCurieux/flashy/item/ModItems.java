package fr.belugaCurieux.flashy.item;
import net.minecraft.world.item.Items;
import fr.belugaCurieux.flashy.Flashy;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Flashy.MOD_ID);

    public static final RegistryObject<Item> TUTO_ITEM = ITEMS.register(
            "tuto_item",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> MODIUM_INGOT = ITEMS.register(
            "modium_ingot",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> BUG = ITEMS.register(
            "bug",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> MODIUM_NUGGET = ITEMS.register(
            "modium_nugget",
            () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

