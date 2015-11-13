package com.rumaruka.xtrememodtweaks.items;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.reference.Reference;

import net.minecraft.item.ItemSpade;

public class xtremeIronShovel extends ItemSpade {

	public xtremeIronShovel(ToolMaterial p_i45353_1_) {
		super(xtrememodtweaks.xtremetoolforiron);
		setUnlocalizedName("XtremeIronShovel");
		setTextureName(Reference.MODID+":"+"x_s_i");
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
	}

}
