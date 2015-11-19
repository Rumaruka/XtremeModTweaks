package com.rumaruka.xtrememodtweaks.event;

import com.google.common.eventbus.Subscribe;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;

public class ConnectionPlayerEvent {
	
	@SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

	event.player.addChatComponentMessage(new ChatComponentText("For a comfortable game, it is recommended do not put value 'false' mobGriefing. Otherwise, you will not be able to play!"));
		
    }

}
