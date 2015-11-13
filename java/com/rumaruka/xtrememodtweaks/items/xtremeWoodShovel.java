package com.rumaruka.xtrememodtweaks.items;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.reference.Reference;

import net.minecraft.item.ItemSpade;

public class xtremeWoodShovel extends ItemSpade {

	public xtremeWoodShovel(ToolMaterial p_i45353_1_) {
		super(xtrememodtweaks.xtremetoolforwooden);
		setUnlocalizedName("XtremeWoodShovel");
		setTextureName(Reference.MODID+":"+"x_s_w");
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
	}

}
