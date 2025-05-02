package dev.edgetom.questFlow.base;

import java.util.HashMap;
import java.util.UUID;

public abstract class Node {

    private UUID uuid;

    public enum Type {
        ENTRY,
        EXIT,
        DIALOGUE,
    }

    private Type type;

    private HashMap<UUID, Node> children;
    private HashMap<UUID, Node> siblings;

    public abstract void start();

    public abstract void finish();

}
