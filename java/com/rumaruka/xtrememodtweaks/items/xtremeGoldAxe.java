package com.rumaruka.xtrememodtweaks.items;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.reference.Reference;

import net.minecraft.item.ItemAxe;

public class xtremeGoldAxe extends ItemAxe {

	public xtremeGoldAxe(ToolMaterial p_i45327_1_) {
		super(xtrememodtweaks.xtremetoolforgold);
		setUnlocalizedName("XtremeGoldAxe");
		setTextureName(Reference.MODID+":"+"x_a_g");
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
	}

}
