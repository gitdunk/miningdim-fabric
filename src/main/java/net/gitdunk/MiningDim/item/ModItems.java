package net.gitdunk.MiningDim.item;

import net.gitdunk.MiningDim.MiningDim;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //public static final Item PLACEHOLDER = registerItem( "PLACEHOLDER",
    //        new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MiningDim.MOD_ID, name), item);
    }
    public static void registerModItems(){
        MiningDim.LOGGER.info("Registering Mod Items for miningdim");
    }

}
