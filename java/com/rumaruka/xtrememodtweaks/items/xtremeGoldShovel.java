package com.rumaruka.xtrememodtweaks.items;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.reference.Reference;

import net.minecraft.item.ItemSpade;

public class xtremeGoldShovel extends ItemSpade {

	public xtremeGoldShovel(ToolMaterial p_i45353_1_) {
		super(xtrememodtweaks.xtremetoolforgold);
		setUnlocalizedName("XtremeGoldShovel");
		setTextureName(Reference.MODID+":"+"x_s_g");
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
	}

}
