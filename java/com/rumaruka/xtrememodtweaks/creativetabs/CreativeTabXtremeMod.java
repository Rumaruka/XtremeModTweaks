package com.rumaruka.xtrememodtweaks.creativetabs;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabXtremeMod extends CreativeTabs {
	  

	    public CreativeTabXtremeMod(int par1, String par2Str, int item)
	    {
	        super(par1, par2Str);
	        
	    }

	    @Override
	    public Item getTabIconItem()
	    {
	       
	         return xtrememodtweaks.xtremeIronPick;
	    }
	}

