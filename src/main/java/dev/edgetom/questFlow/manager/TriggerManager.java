package dev.edgetom.questFlow.manager;

import dev.edgetom.questFlow.QuestFlow;
import dev.edgetom.questFlow.base.Trigger;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class TriggerManager {

    private final QuestFlow plugin;
    private final List<Trigger> triggers;

    public TriggerManager(QuestFlow plugin) {
        this.plugin = plugin;
        this.triggers = new ArrayList<>();
    }

}
