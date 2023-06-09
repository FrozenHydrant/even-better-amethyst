package betathunder.betteramethyst.common.items;

import net.minecraft.world.item.Item;

import java.util.function.Supplier;

import betathunder.betteramethyst.BetterAmethyst;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterAmethyst.MOD_ID);
	
	//public static final RegistryObject<Item> AMETHYST = registerItem("a", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	
	public static RegistryObject<Item> registerItem(String name, Supplier<Item> p) {
		return ITEMS.register(name, p);	
	}
	
	public static void registerItems(IEventBus modEventBus) {
		ITEMS.register(modEventBus);
	}
}


