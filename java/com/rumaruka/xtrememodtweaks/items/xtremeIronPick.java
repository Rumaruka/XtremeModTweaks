package com.rumaruka.xtrememodtweaks.items;

import java.util.List;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.reference.Reference;
import com.rumaruka.xtrememodtweaks.utils.HandlerUtils;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class xtremeIronPick extends ItemPickaxe {

	public xtremeIronPick(ToolMaterial p_i45347_1_) {
		super(xtrememodtweaks.xtremetoolforiron);
		setUnlocalizedName("XtremeIronPick");
		setTextureName(Reference.MODID+":"+"x_w_i");
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
	}
	@Override
	public void addInformation(ItemStack is, EntityPlayer ep, List l, boolean b) {
		
		
		l.add(EnumChatFormatting.GRAY+"Efficiency This Pickaxe == Default Diamond Pickaxe");
	}
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float clickX, float clickY, float clickZ) {
	   
	    boolean used = false;
	    int hotbarSlot = player.inventory.currentItem;
	    int itemSlot = hotbarSlot == 0 ? 8 : hotbarSlot + 1;
	    if (stack.hasTagCompound() && stack.getTagCompound().getBoolean("Torch") && stack.getTagCompound().getInteger("TorchID") > 0)
	        for (int i = 0; i < player.inventory.getSizeInventory(); i++)
	            if (player.inventory.getStackInSlot(i) != null && player.inventory.getStackInSlot(i).getItem() instanceof ItemBlock &&
	                    Block.getIdFromBlock(((ItemBlock) player.inventory.getStackInSlot(i).getItem()).field_150939_a) == stack.getTagCompound().getInteger("TorchID")) {
	                itemSlot = i;
	                break;
	            }

	    ItemStack nearbyStack;

	    if (hotbarSlot < 8) {
	        nearbyStack = player.inventory.getStackInSlot(itemSlot);
	        if (nearbyStack != null) {
	            Item item = nearbyStack.getItem();

	            if (item instanceof ItemBlock) {
	                int posX = x;
	                int posY = y;
	                int posZ = z;

	                switch (side) {
	                    case 0:
	                        --posY;
	                        break;
	                    case 1:
	                        ++posY;
	                        break;
	                    case 2:
	                        --posZ;
	                        break;
	                    case 3:
	                        ++posZ;
	                        break;
	                    case 4:
	                        --posX;
	                        break;
	                    case 5:
	                        ++posX;
	                        break;
	                }

	                AxisAlignedBB blockBounds = AxisAlignedBB.getBoundingBox(posX, posY, posZ, posX + 1, posY + 1, posZ + 1);
	                AxisAlignedBB playerBounds = player.boundingBox;

	                if (item instanceof ItemBlock) {
	                    Block blockToPlace = ((ItemBlock) item).field_150939_a;
	                    if (blockToPlace.getMaterial().blocksMovement()) {
	                        if (playerBounds.intersectsWith(blockBounds))
	                            return false;
	                    }
	                }

	                int dmg = nearbyStack.getItemDamage();
	                int count = nearbyStack.stackSize;
	                if (item == HandlerUtils.openBlocksDevNull) {
	                    //Openblocks uses current inventory slot, so we have to do this...
	                    player.inventory.currentItem = itemSlot;
	                    item.onItemUse(nearbyStack, player, world, x, y, z, side, clickX, clickY, clickZ);
	                    player.inventory.currentItem = hotbarSlot;
	                    player.swingItem();
	                } else
	                    used = item.onItemUse(nearbyStack, player, world, x, y, z, side, clickX, clickY, clickZ);

	                // handle creative mode
	                if (player.capabilities.isCreativeMode) {
	                    // fun fact: vanilla minecraft does it exactly the same way
	                    nearbyStack.setItemDamage(dmg);
	                    player.inventoryContainer.getSlot(itemSlot).onSlotChanged();
	                    nearbyStack.stackSize = count;
	                    player.inventory.inventoryChanged = true;
	                }
	                if (nearbyStack.stackSize < 1) {
	                    nearbyStack = null;
	                    player.inventory.setInventorySlotContents(itemSlot, null);
	                    //player.inventory.inventoryChanged = true;
	                }
	            }
	        }
	    }

	    return used;
	}
}
