package dev.edgetom.questFlow.base;

import java.util.List;
import java.util.UUID;

public class Quest {

    private UUID uuid;

    private String label;

    private List<EntryNode> entryNodes;
    private List<ExitNode> exitNodes;

}
