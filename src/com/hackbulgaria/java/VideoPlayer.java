package com.hackbulgaria.java;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public class VideoPlayer extends SequencePlayer {

    public VideoPlayer(File file, int columns) {
        super(file, columns);
    }

    @Override
    public List<BufferedImage> createImages() {
        return null;
    }
}
