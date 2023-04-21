package com.mammedbrk.logic;

import javax.swing.*;

public class Loop {
    private final int fps;
    private final Runnable update;
    private boolean finished;

    public Loop(int fps, Runnable update) {
        this.fps = fps;
        this.update = update;
        this.finished = false;
    }

    public void run() {
        while (!finished) {
            try {
                Thread.sleep(1000 / fps);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            update.run();
        }
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
