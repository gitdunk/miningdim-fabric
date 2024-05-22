package net.gitdunk.MiningDim.world.dimension;

import net.gitdunk.MiningDim.MiningDim;
import net.gitdunk.MiningDim.block.ModBlocks;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> GITDMINING_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(MiningDim.MOD_ID, "gitdmining"));
    public static final RegistryKey<DimensionType> GITDMINING_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, GITDMINING_DIMENSION_KEY.getValue());


    public static void register() {
        MiningDim.LOGGER.debug("Registering ModDimensions for " + MiningDim.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.PORTAL_BASE)
                .destDimID(GITDMINING_DIMENSION_KEY.getValue())
                .tintColor(0,0, 255)
                .lightWithItem(Items.DIAMOND_PICKAXE)
                .onlyLightInOverworld()
                .registerPortal();
    }
}
