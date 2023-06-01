package com.example.singleton;

public enum ClassUniqueInstance {

    INSTANCE;

    private int click;

    public ClassUniqueInstance getInstance() {
       return INSTANCE;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }
}
