package betathunder.betteramethyst.common.blocks;

import betathunder.betteramethyst.BetterAmethyst;
import betathunder.betteramethyst.common.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterAmethyst.MOD_ID);
	
	public static final RegistryObject<Block> CHISELED_AMETHYST_CRYSTAL_BLOCK = registerBlock("chiseled_amethyst_crystal_block", () -> new Block(Properties.of(Material.AMETHYST).sound(SoundType.AMETHYST).strength(3f, 9f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> SMOOTH_AMETHYST_CRYSTAL_BLOCK = registerBlock("smooth_amethyst_crystal_block", () -> new Block(Properties.of(Material.AMETHYST).sound(SoundType.AMETHYST).strength(3f, 9f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> AMETHYST_CRYSTAL_BLOCK = registerBlock("amethyst_crystal_block", () -> new Block(Properties.of(Material.AMETHYST).sound(SoundType.AMETHYST).strength(3f, 9f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> AMETHYST_CRYSTAL_LAMP = registerBlock("amethyst_crystal_lamp", () -> new Block(Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(0.3f, 0.3f).lightLevel((b) -> {return 15;})));
	public static final RegistryObject<Block> AMETHYST_REDSTONE_LAMP = registerBlock("amethyst_redstone_lamp", () -> new RedstoneLampBlock(Properties.of(Material.AMETHYST).sound(SoundType.AMETHYST).strength(0.3f, 0.3f).lightLevel((b) -> {if (b.getValue(RedstoneLampBlock.LIT)) {return 15;} else {return 0;}})));

	public static final RegistryObject<Block> AMETHYST_BRICKS = registerBlock("amethyst_bricks", () -> new Block(Properties.of(Material.AMETHYST).sound(SoundType.AMETHYST).strength(1.5f, 6f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> AMETHYST_BRICKS_SLAB = registerBlock("amethyst_bricks_slab", () -> new SlabBlock(Properties.of(Material.AMETHYST).sound(SoundType.AMETHYST).strength(1.5f, 6f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> AMETHYST_BRICKS_STAIRS = registerBlock("amethyst_bricks_stairs", () -> new StairBlock(() -> AMETHYST_BRICKS.get().defaultBlockState(), Properties.of(Material.AMETHYST).sound(SoundType.AMETHYST).strength(1.5f, 6f).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> AMETHYST_BRICKS_WALL = registerBlock("amethyst_bricks_wall", () -> new WallBlock(Properties.of(Material.AMETHYST).sound(SoundType.AMETHYST).strength(1.5f, 6f).requiresCorrectToolForDrops()));

	public static RegistryObject<Block> registerBlock(String name, Supplier<Block> b) {
		RegistryObject<Block> tmp = BLOCKS.register(name, b);
		registerBlockItem(name, tmp);
		return tmp;
	}
	
	public static void registerBlockItem(String name, RegistryObject<Block> b) {
		ModItems.registerItem(name, () -> new BlockItem(b.get(), new Item.Properties()));
	}
	
	public static void registerBlocks(IEventBus modEventBus) {
		BLOCKS.register(modEventBus);
	}

}


