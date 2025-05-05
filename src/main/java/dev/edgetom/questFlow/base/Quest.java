package dev.edgetom.questFlow.base;

import dev.edgetom.questFlow.QuestFlow;

import java.util.List;
import java.util.UUID;

public class Quest {

    private QuestFlow plugin;

    private UUID uuid;

    private String label;

    private List<EntryNode> entryNodes;
    private List<ExitNode> exitNodes;

}
