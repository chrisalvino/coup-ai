package org.coupai.core;

public class Card {

    public Card(Type type) {
        this.type = type;
    }

    public enum Type {
        AMBASSADOR,
        ASSASSIN,
        CAPTAIN,
        CONTESSA,
        DUKE
    }

    public String toString() {
        switch (type) {
            case AMBASSADOR:
                return "Ambassador";
            case ASSASSIN:
                return "Assassin";
            case CAPTAIN:
                return "Captain";
            case CONTESSA:
                return "Contessa";
            case DUKE:
                return "Duke";
        }
        throw new RuntimeException("Card type unknown!");
    }

    public Type getType() {
        return type;
    }

    public boolean canExchange() {
        return type == Type.AMBASSADOR
    }

    public boolean canAssassinate() {
        return type == Type.ASSASSIN;
    }

    public boolean canTax() {
        return type == Type.DUKE;
    }

    public boolean canSteal() {
        return type == Type.CAPTAIN;
    }

    public boolean canBlockForeignAid() {
        return type == Type.DUKE;
    }

    public boolean canBlockAssassinate() {
        return type == Type.CONTESSA;
    }

    public boolean canBlockSteal() {
        return type == Type.AMBASSADOR || type == Type.CAPTAIN;
    }

    private Type type;
}
