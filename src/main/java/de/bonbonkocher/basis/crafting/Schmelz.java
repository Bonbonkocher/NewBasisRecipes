package de.bonbonkocher.basis.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import de.bonbonkocher.basis.Basis;

public class Schmelz
{
	public Schmelz()
	{
		if(Basis.Leather)
		{
			GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 0.35F);
		}
		if(Basis.Charcoal)
		{
			GameRegistry.addSmelting(Blocks.planks, new ItemStack(Items.coal, 1, 1), 0.15F);
		}
	}
}