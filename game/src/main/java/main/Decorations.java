package main;

public enum Decorations {
    SHOP(      "<|------|--~/Shop\\~--|------|>",
            "<|------|----~\\/~----|------|>"
    ),
    PLAYER    ("+---------------|---------------+",
            "+---------------|---------------+");

    public String top;
    public String bottom;

    Decorations(String top, String bottom){
        this.top = top;
        this.bottom = bottom;
    }
}
