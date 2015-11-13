package com.rumaruka.xtrememodtweaks;


import javax.sql.ConnectionEvent;

import com.rumaruka.xtrememodtweaks.creativetabs.CreativeTabXtremeMod;
import com.rumaruka.xtrememodtweaks.event.ConnectionPlayerEvent;
import com.rumaruka.xtrememodtweaks.items.xtremeDiamondAxe;
import com.rumaruka.xtrememodtweaks.items.xtremeDiamondPick;
import com.rumaruka.xtrememodtweaks.items.xtremeDiamondShovel;
import com.rumaruka.xtrememodtweaks.items.xtremeGoldAxe;
import com.rumaruka.xtrememodtweaks.items.xtremeGoldPick;
import com.rumaruka.xtrememodtweaks.items.xtremeGoldShovel;
import com.rumaruka.xtrememodtweaks.items.xtremeIronAxe;
import com.rumaruka.xtrememodtweaks.items.xtremeIronPick;
import com.rumaruka.xtrememodtweaks.items.xtremeIronShovel;
import com.rumaruka.xtrememodtweaks.items.xtremeStoneAxe;
import com.rumaruka.xtrememodtweaks.items.xtremeStonePick;
import com.rumaruka.xtrememodtweaks.items.xtremeStoneShovel;
import com.rumaruka.xtrememodtweaks.items.xtremeWoodAxe;
import com.rumaruka.xtrememodtweaks.items.xtremeWoodShovel;
import com.rumaruka.xtrememodtweaks.reference.*;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid=Reference.MODID,name=Reference.NAME ,version=Reference.VERSION, certificateFingerprint = Reference.FINGERPRINT)
public class xtrememodtweaks {
	
	@Mod.Instance("xtrememodtweaks")
	public static xtrememodtweaks instance;

	
	//XtremeCreativeTabs
	public static final CreativeTabs tabXtremeModTweaks = new CreativeTabXtremeMod(CreativeTabs.getNextID(), Reference.NAME, 1);
	
	
	//XtremePickaxe
	public static Item xtremeWoodPick;
	public static Item xtremeStonePick;
	public static Item xtremeGoldPick;
	public static Item xtremeIronPick;
	public static Item xtremeDiamondPick;
	
	//XtremeShovel
	public static Item xtremeIronShovel;
	public static Item xtremeWoodShovel;
	public static Item xtremeStoneShovel;
	public static Item xtremeGoldShovel;
	public static Item xtremeDiamondShovel;
	
	//XtremeAxe
	public static Item xtremeWoodAxe;
	public static Item xtremeStoneAxe;
	public static Item xtremeIronAxe;
	public static Item xtremeGoldAxe;
	public static Item xtremeDiamondAxe;
	
	
	
	public static final ToolMaterial 
	xtremetoolforwooden = EnumHelper.addToolMaterial("xtw", 0, 65, 4.0F, 1.0F, 15),
	xtremetoolforstone = EnumHelper.addToolMaterial("xts", 1, 145, 6.0F, 2.0F,6),
	xtremetoolforiron = EnumHelper.addToolMaterial("xti", 2, 265, 8.0F, 3.0F, 20),
	xtremetoolforgold = EnumHelper.addToolMaterial("xtg", 0, 40, 1.0F, 0.0F, 65),
	xtremetoolfordiamond = EnumHelper.addToolMaterial("xtd", 3, 2000, 10.0F, 4.0F, 15);
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent evet)
	{
		xtremeWoodPick = new com.rumaruka.xtrememodtweaks.items.xtremeWoodPick(xtremetoolforwooden);
		xtremeStonePick = new xtremeStonePick(xtremetoolforstone);
		xtremeGoldPick = new xtremeGoldPick(xtremetoolforgold);
		xtremeIronPick = new xtremeIronPick(xtremetoolforiron);
		xtremeDiamondPick = new xtremeDiamondPick(xtremetoolfordiamond);
		xtremeIronShovel = new xtremeIronShovel(xtremetoolforiron);
		xtremeWoodShovel = new xtremeWoodShovel(xtremetoolforwooden);
		xtremeStoneShovel = new xtremeStoneShovel(xtremetoolforstone);
		xtremeGoldShovel = new xtremeGoldShovel(xtremetoolforgold);
		xtremeDiamondShovel = new xtremeDiamondShovel(xtremetoolfordiamond);
		xtremeWoodAxe = new xtremeWoodAxe(xtremetoolforwooden);
		xtremeStoneAxe = new xtremeStoneAxe(xtremetoolforstone);
		xtremeIronAxe = new xtremeIronAxe(xtremetoolforiron);
		xtremeGoldAxe = new xtremeGoldAxe(xtremetoolforgold);
		xtremeDiamondAxe = new xtremeDiamondAxe(xtremetoolfordiamond);
		GameRegistry.registerItem(xtremeDiamondPick, "XtremeDiamondPick");
		GameRegistry.registerItem(xtremeWoodPick, "XtremeWoodPick");
		GameRegistry.registerItem(xtremeStonePick,"XtremeStonePick");
		GameRegistry.registerItem(xtremeGoldPick, "XtremeGoldPick");
		GameRegistry.registerItem(xtremeIronPick, "XtremeIronPick");
		GameRegistry.registerItem(xtremeIronShovel, "XtremeIronShovel");
		GameRegistry.registerItem(xtremeWoodShovel, "XtremeWoodShovel");
		GameRegistry.registerItem(xtremeStoneShovel, "XtremeStoneShovel");
		GameRegistry.registerItem(xtremeGoldShovel, "XtremeGoldShovel");
		GameRegistry.registerItem(xtremeDiamondShovel, "XtremeDiamondShovel");
		GameRegistry.registerItem(xtremeWoodAxe, "xtremeWoodAxe");
		GameRegistry.registerItem(xtremeStoneAxe, "xtremeStoneAxe");
		GameRegistry.registerItem(xtremeIronAxe,"xtremeIronAxe");
		GameRegistry.registerItem(xtremeGoldAxe, "xtremeGoldAxe");
		GameRegistry.registerItem(xtremeDiamondAxe, "xtremeDiamondAxe");
		
		
		
		FMLCommonHandler.instance().bus().register(new ConnectionPlayerEvent());
	}
	@Mod.EventHandler
	public void Init(FMLInitializationEvent evet)
	{
	
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent evet)
	{
		
	}
}
