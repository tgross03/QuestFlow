package dev.edgetom.questFlow.base;

import dev.edgetom.questFlow.QuestFlow;
import org.bukkit.entity.Player;

import java.util.UUID;

public abstract class Trigger {

    private QuestFlow plugin;

    private UUID uuid;
    private Node node;

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

    public static Trigger fromUUID(UUID uuid) {
        return QuestFlow.plugin.getTriggerManager().getTriggers().stream()
                .filter(trigger -> trigger.uuid.equals(uuid))
                .findFirst()
                .orElse(null);
    }

}
