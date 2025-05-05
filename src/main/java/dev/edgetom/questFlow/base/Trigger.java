package dev.edgetom.questFlow.base;

import org.bukkit.entity.Player;

import java.util.UUID;

public abstract class Trigger {

    private UUID uuid;

    // full labels will have form quest_label:trigger:trigger_type:label
    private String label; // labels must be unique per quest (!)

    public enum Type {
        PROXIMITY,
        NPC_INTERACT,
        DIALOGUE,
        NOTICE_BOARD_INTERACT,
    }

    private Type type;

    public abstract void execute(Player player);

}
