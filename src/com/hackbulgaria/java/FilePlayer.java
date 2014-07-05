package com.hackbulgaria.java;

import java.io.File;

public abstract class FilePlayer implements Player {
    protected File file;
    protected int columns;

    public FilePlayer(File file, int columns) {
        this.file = file;
        this.columns = columns;

    }
}
