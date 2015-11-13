package com.rumaruka.xtrememodtweaks.items;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.reference.Reference;

import net.minecraft.item.ItemSpade;

public class xtremeDiamondShovel extends ItemSpade {

	public xtremeDiamondShovel(ToolMaterial p_i45353_1_) {
		super(xtrememodtweaks.xtremetoolfordiamond);
		setUnlocalizedName("XtremeDiamondShovel");
		setTextureName(Reference.MODID+":"+"x_s_d");
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
	}

}
