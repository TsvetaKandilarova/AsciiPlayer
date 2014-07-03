package com.hackbulgaria.java;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import com.hackbulgaria.java.utils.PlayerUtils;

public class PicturePlayer extends FilePlayer {
    public PicturePlayer(File file) {
        super(file);
    }

    @Override
    public void play(List<BufferedImage> list, int columns) {
        PlayerUtils.write(list.get(0), columns);
    }

}
