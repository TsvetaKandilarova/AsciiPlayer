package com.hackbulgaria.java;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public abstract class SequencePlayer extends FilePlayer {

    public SequencePlayer(File file, int columns) {
        super(file, columns);
    }

    @Override
    public void play() {
        for (final BufferedImage image : createImages()) {

        }
    }

    public abstract List<BufferedImage> createImages();

}
