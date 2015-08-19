package de.bonbonkocher.basis.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import de.bonbonkocher.basis.Basis;

public class NahrungFormlos
{
	public NahrungFormlos()
	{        
        if(Basis.Wheat_Seeds)
        {
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.wheat_seeds, 1), new Object[] {new ItemStack(Items.wheat, 1)});
        }
	}
}
