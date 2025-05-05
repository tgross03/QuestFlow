package dev.edgetom.questFlow.base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class EntryNode extends Node {

    private final Type type = Type.ENTRY;

}
