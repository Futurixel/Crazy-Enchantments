package me.badbones69.crazyenchantments.controllers;

import me.badbones69.crazyenchantments.api.CrazyEnchantments;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;

public class TotemOfUndyingListener implements Listener {

    @EventHandler
    public void onResurrect(EntityResurrectEvent e){
        if(!e.isCancelled()){
            if(e.getEntity() instanceof Player) {
                Player player = (Player)e.getEntity();
                Bukkit.getScheduler().runTaskLater(CrazyEnchantments.getInstance().getPlugin(), () -> {
                    CrazyEnchantments.getInstance().updatePlayerEffects(player);
                }, 1);
            }
        }
    }

}
