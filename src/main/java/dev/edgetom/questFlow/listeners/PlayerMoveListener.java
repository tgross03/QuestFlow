package dev.edgetom.questFlow.listeners;

import dev.edgetom.questFlow.QuestFlow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMoveListener implements Listener {

    private final QuestFlow plugin;

    public PlayerMoveListener(QuestFlow plugin) {
        this.plugin = plugin;
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent event) {

        Player player = event.getPlayer();


    }

}
