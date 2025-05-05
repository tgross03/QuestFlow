package dev.edgetom.questFlow.base;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
public abstract class Node {

    private UUID uuid;

    // full labels will have form quest_label:node:node_type:label
    private String label; // node labels must be unique per quest (!)

    private List<Trigger> triggers;

    public enum Type {
        ENTRY,
        EXIT,
        DIALOGUE,
    }

    private Type type;

    private HashMap<UUID, Node> children; // possible nodes to be reached after this node
    private HashMap<UUID, Node> siblings; // nodes that are executed in parallel to this node

    public abstract void start();

    public abstract void finish();

}
