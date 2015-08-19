package de.bonbonkocher.basis.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import de.bonbonkocher.basis.Basis;

public class BauGeformt
{
	public BauGeformt()
	{
	    if(Basis.Web)
	    {
	        GameRegistry.addShapedRecipe(new ItemStack(Blocks.web), new Object[] {"SSS", "SSS", "SSS", 'S', Items.string});
	    }
	    
	    if(Basis.Chiseled_Stone_Bricks)
	    {
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 1, 3), new Object[] {"   ", "S  ", "S  ", 'S', new ItemStack(Blocks.stone_slab, 1, 5)});
	    }
	    
	    if(Basis.Mossy_Stone_Bricks)
	    {
	    	GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 4, 1), new Object[] {"M M", "   ", "M M", 'M', Blocks.mossy_cobblestone});
	    }
	    
	    if(Basis.Sponge)
		{
		    GameRegistry.addShapedRecipe(new ItemStack(Blocks.sponge, 2), new Object[] {"LRL", "BWB", "LRL", 'L', Blocks.leaves, 'B', Blocks.brown_mushroom, 'R', Blocks.red_mushroom, 'W', new ItemStack(Blocks.wool, 1, 4)});
		    GameRegistry.addShapedRecipe(new ItemStack(Blocks.sponge, 2), new Object[] {"LBL", "RWR", "LBL", 'L', Blocks.leaves, 'B', Blocks.brown_mushroom, 'R', Blocks.red_mushroom, 'W', new ItemStack(Blocks.wool, 1, 4)});
		    GameRegistry.addShapedRecipe(new ItemStack(Blocks.sponge, 1), new Object[] {"LRL", "RWR", "LRL", 'L', Blocks.leaves, 'B', Blocks.brown_mushroom, 'R', Blocks.red_mushroom, 'W', new ItemStack(Blocks.wool, 1, 4)});
		    GameRegistry.addShapedRecipe(new ItemStack(Blocks.sponge, 1), new Object[] {"LBL", "BWB", "LBL", 'L', Blocks.leaves, 'B', Blocks.brown_mushroom, 'R', Blocks.red_mushroom, 'W', new ItemStack(Blocks.wool, 1, 4)});
		}
	}
}
