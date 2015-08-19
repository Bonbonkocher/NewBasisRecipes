package de.bonbonkocher.basis.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import de.bonbonkocher.basis.Basis;

public class ManagerCrafting
{
	public ManagerCrafting()
	{
		new BasisFormlos();
		new BasisGeformt();
		new BauFormlos();
		new BauGeformt();
		new NahrungFormlos();
		new NahrungGeformt();
		new RuestungFormlos();
		new RuestungGeformt();
		new Schmelz();
		new VerschiedeneFormlos();
		new VerschiedeneGeformt();
	}
}
