package com.rumaruka.xtrememodtweaks.items;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.reference.Reference;

import net.minecraft.item.ItemSpade;

public class xtremeStoneShovel extends ItemSpade {

	public xtremeStoneShovel(ToolMaterial p_i45353_1_) {
		super(xtrememodtweaks.xtremetoolforstone);
		setUnlocalizedName("XtremeIronShovel");
		setTextureName(Reference.MODID+":"+"x_s_s");
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
	}

}
