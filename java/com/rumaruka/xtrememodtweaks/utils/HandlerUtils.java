package com.rumaruka.xtrememodtweaks.utils;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class HandlerUtils {
	  public static Item openBlocksDevNull;
	  public static void init() {
	        openBlocksDevNull = GameRegistry.findItem("OpenBlocks", "devnull");
	    }
}
