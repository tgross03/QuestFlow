package dev.edgetom.questFlow.base;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.UUID;

@Getter
@Setter
public abstract class ExitNode extends Node {

    private final Type type = Type.EXIT;

}
