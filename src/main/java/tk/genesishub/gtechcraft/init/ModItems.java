package tk.genesishub.gtechcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import tk.genesishub.gtechcraft.item.ItemGTC;
import tk.genesishub.gtechcraft.item.ItemMatrixController;

public class ModItems {
	
	public static final ItemGTC matrixcontroller = new ItemMatrixController();
	
	public static void init()
	{
		GameRegistry.registerItem(matrixcontroller, "MatrixController");
	}

}
