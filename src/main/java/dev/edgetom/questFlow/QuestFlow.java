package dev.edgetom.questFlow;

import dev.edgetom.questFlow.manager.TriggerManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class QuestFlow extends JavaPlugin {

    public static QuestFlow plugin;
    private TriggerManager triggerManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        this.triggerManager = new TriggerManager(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
