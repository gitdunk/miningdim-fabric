package net.gitdunk.MiningDim.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gitdunk.MiningDim.MiningDim;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block PORTAL_BASE = registerBlock("portal_base",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)), ItemGroup.MISC);
    public static final Block PORTAL = registerBlock("portal",
            new Block(FabricBlockSettings.of(Material.PORTAL).strength(999f).sounds(BlockSoundGroup.GLASS)), ItemGroup.MISC);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MiningDim.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MiningDim.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MiningDim.LOGGER.info(("Registering ModBlocks for " + MiningDim.MOD_ID));
    }
}
