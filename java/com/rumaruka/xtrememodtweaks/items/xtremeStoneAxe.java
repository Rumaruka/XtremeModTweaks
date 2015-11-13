package com.rumaruka.xtrememodtweaks.items;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.reference.Reference;

import net.minecraft.item.ItemAxe;

public class xtremeStoneAxe extends ItemAxe {

	public xtremeStoneAxe(ToolMaterial p_i45327_1_) {
		super(xtrememodtweaks.xtremetoolforstone);
		setUnlocalizedName("XtremeStoneAxe");
		setTextureName(Reference.MODID+":"+"x_a_s");
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
	}

}
