package com.rumaruka.xtrememodtweaks.items;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.reference.Reference;

import net.minecraft.item.ItemAxe;

public class xtremeWoodAxe extends ItemAxe {

	public xtremeWoodAxe(ToolMaterial p_i45327_1_) {
		super(xtrememodtweaks.xtremetoolforwooden);
		setUnlocalizedName("XtremeWoodAxe");
		setTextureName(Reference.MODID+":"+"x_a_w");
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
	}

}
