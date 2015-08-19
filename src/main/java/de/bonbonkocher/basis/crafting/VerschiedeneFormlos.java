package de.bonbonkocher.basis.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import de.bonbonkocher.basis.Basis;

public class VerschiedeneFormlos
{
	public VerschiedeneFormlos()
	{
        if(Basis.Sand)
        {
        	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand, 4), new Object[] {Blocks.sandstone});
        }
        
        if(Basis.Mossy_Stone_Bricks)
        {
    		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stonebrick, 1, 1), new Object[] {new ItemStack(Blocks.vine, 1), new ItemStack(Blocks.stonebrick, 1)});
        }
        
        if(Basis.Mossy_Cobblestone)
        {
        	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.mossy_cobblestone, 1), new Object[] {new ItemStack(Blocks.vine, 1), new ItemStack(Blocks.cobblestone, 1)});
        }
        
        if(Basis.Wheat_Seeds)
        {
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.wheat_seeds, 1), new Object[] {new ItemStack(Items.wheat, 1)});
        }
        
        if(Basis.String)
        {
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 0)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 1)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 2)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 3)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 4)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 5)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 6)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 7)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 8)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 9)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 10)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 11)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 12)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 13)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 14)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1, 15)});
        }
        
        if(Basis.Ice)
    	{
        	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ice, 1), new Object[] {new ItemStack(Items.potionitem, 1), new ItemStack(Items.snowball, 1), new ItemStack(Items.snowball, 1)});
        }
	}
}
