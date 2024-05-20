package net.gitdunk.MiningDim;

import net.fabricmc.api.ModInitializer;
import net.gitdunk.MiningDim.block.ModBlocks;
import net.gitdunk.MiningDim.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiningDim implements ModInitializer {
	public static final String MOD_ID = "gitdminingdim";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
