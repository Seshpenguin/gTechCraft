package tk.genesishub.gtechcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import tk.genesishub.gtechcraft.block.BlockGTC;
import tk.genesishub.gtechcraft.block.BlockMatrixProgrammer;
import tk.genesishub.gtechcraft.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	
	public static final BlockGTC MatrixProgrammer = new BlockMatrixProgrammer();
	
	public static void init()
	{
		GameRegistry.registerBlock(MatrixProgrammer, "MatrixProgrammer");
	}

}
